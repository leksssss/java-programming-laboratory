package package3;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class MyComputingClient {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Socket s = new Socket("localhost",8080);
		DataInputStream dis = new DataInputStream(s.getInputStream());
		DataOutputStream dos =  new DataOutputStream(s.getOutputStream());
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 10 Numbers: ");
		
		int[] a= new int[10];
		for(int i=0;i<10;i++) {
			System.out.print("Enter the "+(i+1)+"th number: ");
			a[i]= input.nextInt();
		}
		
		for(int i=0;i<10;i++) {
			dos.writeUTF(""+a[i]);
		}
		
		System.out.println(dis.readUTF());
		
		input.close();
		dis.close();
		dos.close();
		s.close();		
	}

}
