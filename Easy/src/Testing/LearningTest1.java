/**
 * 
 */
package Testing;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class LearningTest1 {

	@Test
	public void test() {
		
		 int ia[][] = { {1, 2},{1,2}};
	      for (int i = 0; i < 2; i++)
	         for (int j = 0; j < 2; j++){
	            System.out.println(ia[i][j]);
	            Assert.assertEquals("Yo yo", j, i);}
	//	fail("Not yet implemented");
	}

}
