package java2Enterprise;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class HttpClient {

	public HttpClient() throws Exception{
		//creating Network Socket
		final Socket so=new Socket("localhost",8080);
		final OutputStream os= so.getOutputStream();
		
		//Request  
		final String  request="GET"+"http://localhost:8080/onlineshop-war/"+"HTTP/1.1\r\n";
		os.write(request.getBytes());
		
		//request body
		final String header="Host: localhost\r\n\r\n";
		os.write(header.getBytes());
		
		//response
		final InputStream in = so.getInputStream();
		final byte[] b=new byte[1];
		while((in.read(b))!= -1){
			System.out.write(b, 0, 1);
		}
		
		//close connection
		os.close();
		in.close();
		so.close();
		
	}

	public static void main(String[] args) {
		/*throws Exception{
			new HttpClient();
			}*/
		
		

	}

}
