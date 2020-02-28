<?php
/*
   _                          _____     _       ____    ____      __ _
  / /                        |_   _|   / \     |_   \  /   _|    / /\ \
 / /  _ .--..--.    _   __     | |    / _ \      |   \/   |     / /  \ \
< <  [ `.-. .-. |  [ \ [  ]_   | |   / ___ \     | |\  /| |    / /    > >
 \ \  | | | | | |   \ '/ /| |__' | _/ /   \ \_  _| |_\/_| |_  / /    / /
  \_\[___||__||__][\_:  / `.____.'|____| |____||_____||_____|/_/    /_/ Community Edition
                   \__.' o---------------------------------------------------------------
                         |
                         o--------o Project Coordinator, CTO: Dr. rer. nat. Stephan Raub
                                  o B.Sc. Ingo Breuer
                                  o Michael Schlapa
                                  o Dennis-Bendert Schramm (retired)
                                  o Marcus Ihde-Meister
                                  o Christoph Gierling (retired)

Copyright (C) 2010,2011 The <myJAM/> Team, Heinrich-Heine-University Duesseldorf, Germany.

https://sourceforge.net/projects/myjam

This program is free software; you can redistribute it and/or
modify it under the terms of the GNU General Public License
as published by the Free Software Foundation; either version 2
of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307,
USA.
*/

require_once(_FULLPATH.'/classes/class_myJAM_DB.php');
class myJAM_Architecture
{
  PROTECTED STATIC $db;
  PROTECTED STATIC $nbArchs;
  PROTECTED STATIC $vArchIndex;
  PROTECTED STATIC $vArchName;
  PROTECTED STATIC $vArchIndexHash;
  PROTECTED STATIC $vArchNameHash;
  PROTECTED STATIC $vNbCoresHash;
  PROTECTED STATIC $vNbNodesHash;
  PROTECTED STATIC $vCPUNameHash;
  PROTECTED STATIC $vCPUClockHash;
//o-------------------------------------------------------------------------------o
  PUBLIC function __construct()
//o-------------------------------------------------------------------------------o
  {
    if (!is_object(self::$db))
    {
      self::$db = new myJAM_DB();
      // Der Default Wert 0 ist fuer unbekannte Architekuren vorgesehen, Notwendig fuer Discover
      $query = 'SELECT ArchID, ArchName, CPUName, CPUClock FROM Architectures where ArchID!=0';
      $vResults = self::$db->query($query);
      self::$nbArchs = self::$db->num_rows();
      if (self::$nbArchs < 1)
      {
        die('myJAM_Architectures>> ERROR! NO ARCHITECTURES FOUND IN DATABASE!!!');
      }
      self::$vArchIndex = array();
      self::$vArchName = array();
      self::$vArchIndexHash = array();
      self::$vArchNameHash = array();
      for($i = 0; $i < self::$nbArchs; $i++)
      {
        $ind = $vResults[$i]['ArchID'];
        $name = $vResults[$i]['ArchName'];
        self::$vArchIndex[$i] = $ind;
        self::$vArchName[$i] = $name;
        self::$vArchNameHash[$ind] = $name;
        self::$vArchIndexHash[$name] = $ind;
        self::$vNbCoresHash[$ind] = (int)self::getNbCores($ind);
        self::$vNbNodesHash[$ind] = (int)self::getNbNodes($ind);
        self::$vCPUNameHash[$ind] = $vResults[$i]['CPUName'];
        self::$vCPUClockHash[$ind] = $vResults[$i]['CPUClock'];
      }
    }
  }
//o-------------------------------------------------------------------------------o
  PUBLIC function __get($name)
//o-------------------------------------------------------------------------------o
  {
    switch($name)
    {
      case 'nb':
        return self::$nbArchs;
      case 'Name':
        return self::$vArchNameHash;
      case 'NameList':
        return self::$vArchName;
      case 'ID':
        return self::$vArchIndexHash;
      case 'IDList':
        return self::$vArchIndex;
      case 'nbCores':
        return self::$vNbCoresHash;
      case 'nbNodes':
        return self::$vNbNodesHash;
      case 'CPUName':
        return self::$vCPUNameHash;
      case 'CPUClock':
        return self::$vCPUClockHash;
      default:
        return NULL;
    }
  }
  //o-------------------------------------------------------------------------------o
  PUBLIC static function Create($ArchName)
  //o-------------------------------------------------------------------------------o
  {
    $db = new myJAM_db();
    $ArchName = htmlentities($ArchName);
    $sql = 'INSERT INTO Architectures (ArchName, CPUName, CPUClock) VALUES'
          .' (\'' . mysql_real_escape_string($ArchName) . '\', \'\', \'\')';
    $db->DoSQL($sql);
    $NewArchID = $db->last_insert_id();
    if($NewArchID < 0)
    {
      die('myJAM>> FATAL ERROR 0x02aab in class myJAM_Architectures');
    }
    self::DestroyCache();
    new myJAM_Architecture();
    return $NewArchID;
  }
//o-------------------------------------------------------------------------------o
  PUBLIC function Update($ArchID, $ArchName, $CPUName, $CPUClock)
//o-------------------------------------------------------------------------------o
  {
    $ArchName = htmlentities($ArchName);
    $CPUName = htmlentities($CPUName);
    $CPUClock = htmlentities($CPUClock);
    $ArchID = (int)$ArchID;
    $sql = "UPDATE Architectures SET ";
    $sql .= "ArchName = '".mysql_real_escape_string($ArchName)."'";
    $sql .= ", CPUName ='".mysql_real_escape_string($CPUName)."'";
    $sql .= ", CPUCLock ='".mysql_real_escape_string($CPUClock)."'";
    $sql .= " WHERE ArchID='".$ArchID."'";
    self::$db->DoSQL($sql);
    $pointer = array_search($ArchID, self::$vArchIndex);
    unset(self::$vArchIndexHash[self::$vArchNameHash[$ArchID]]);
    self::$vArchName[$pointer] = $ArchName;
    self::$vArchIndex[$pointer] = $ArchID;
    self::$vArchNameHash[$ArchID] = $ArchName;
    self::$vArchIndexHash[$ArchName] = $ArchID;
    self::$vCPUNameHash[$ArchID] = $CPUName;
    self::$vCPUClockHash[$ArchID] = $CPUClock;
  }
//o-------------------------------------------------------------------------------o
  PUBLIC function DELETE($ArchID)
//o-------------------------------------------------------------------------------o
  {
//delete entry in table "Architectures"
    $sql = "DELETE FROM Architectures WHERE ArchID='" . (int)$ArchID . "'";
    self::$db->DoSQL($sql);
    $OldArchName = self::$vArchNameHash[$ArchID];
    $pointer = array_search($ArchID, self::$vArchIndex);
    unset(self::$vArchIndex[$pointer]);
    unset(self::$vArchName[$pointer]);
    unset(self::$vArchNameHash[$ArchID]);
    unset(self::$vArchIndexHash[$OldArchName]);
    unset(self::$vNbCoresHash[$ArchID]);
    unset(self::$vCPUNameHash[$ArchID]);
    unset(self::$vCPUClockHash[$ArchID]);
    self::$nbArchs--;
    //now set all links to the deleted entry in table "Nodes" to zero...
    $sql = "UPDATE Nodes SET ArchID=0 WHERE ArchID='" . (int)$ArchID . "'";
    self::$db->DoSQL($sql);
  }
  //o-------------------------------------------------------------------------------o
  PROTECTED function getNbCores($ArchID)
  //o-------------------------------------------------------------------------------o
  {
    $sql = "SELECT sum(nbCPUs*nbCPUCores) FROM Nodes WHERE ArchID='".(int)$ArchID."'";
    $res = self::$db->query($sql);
    return $res[0]['sum(nbCPUs*nbCPUCores)'];
  }
  //o-------------------------------------------------------------------------------o
  PROTECTED function getNbNodes($ArchID)
  //o-------------------------------------------------------------------------------o
  {
    $sql = "SELECT sum(NodeID) FROM Nodes WHERE ArchID='".(int)$ArchID."'";
    $res = self::$db->query($sql);
    return $res[0]['sum(NodeID)'];
  }
  //o-------------------------------------------------------------------------------o
  public static function DestroyCache()
  //o-------------------------------------------------------------------------------o
  {
    self::$db = NULL;
    self::$nbArchs = NULL;
    self::$vArchIndex = array();
    self::$vArchName = array();
    self::$vArchIndexHash = array();
    self::$vArchNameHash = array();
    self::$vNbCoresHash = array();
    self::$vCPUNameHash = array();
    self::$vCPUClockHash = array();
  }
}
