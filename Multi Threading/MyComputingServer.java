package package3;

import java.io.*;
import java.net.*;

public class MyComputingServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter the numbers");
		ServerSocket ss = new ServerSocket(8080);
		Socket s = ss.accept();
		DataInputStream dis = new DataInputStream(s.getInputStream());
		DataOutputStream dos = new DataOutputStream(s.getOutputStream());
		
		
		int sum =0;
		for(int i=0;i<10;i++) {
			String str = dis.readUTF();
			
			sum += Integer.parseInt(str);
		}
		
		dos.writeUTF("The Sum is "+sum);
		
		dos.close();
		dis.close();
		ss.close();
		s.close();
	}

}
