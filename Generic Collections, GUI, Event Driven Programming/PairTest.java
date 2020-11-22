package p1;

import java.util.Scanner;

public class PairTest {
	
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two integers :");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		Pair<Integer, Integer> int_pair = new Pair<Integer,Integer>();
		int_pair.setFirst(num1);
		int_pair.setSecond(num2);
		System.out.println("("+int_pair.getFirst()+","+int_pair.getSecond()+")");
		
		System.out.println("Enter two doubles :");
		double d1 = input.nextDouble();
		double d2 = input.nextDouble();
		Pair<Double, Double> double_pair = new Pair<Double, Double>();
		double_pair.setFirst(d1);
		double_pair.setSecond(d2);
		System.out.println("("+double_pair.getFirst()+","+double_pair.getSecond()+")");
		
		System.out.println("Enter two strings :");
		String s1 = input.next();
		String s2 = input.next();
		Pair<String, String> string_pair = new Pair<String,String>();
		string_pair.setFirst(s1);
		string_pair.setSecond(s2);
		System.out.println("("+string_pair.getFirst()+","+string_pair.getSecond()+")");
		
		input.close();
	}
}
