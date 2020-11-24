package interfaces;

import java.util.ArrayList;

public class MyCalculator implements AdvancedArithmetic{
	/*
	 //Question taken from Hackerrank
	 You are given an interface AdvancedArithmetic which contains a method signature int divisor_sum(int n). 
	 You need to write a class called MyCalculator which implements the interface.
	 divisorSum function just takes an integer as input and return the sum of all its divisors. 
	 For example divisors of 6 are 1, 2, 3 and 6, so divisor_sum should return 12. 
	 The value of n will be at most 1000.
	 */
		
	MyCalculator(){
		
	}
	
	@Override
	public int divisorSum(int n) {
		ArrayList<Integer> divisors = new ArrayList<Integer>();
		divisors.add(1);
		//System.out.print("1 ");
		for(int i=2; i<=n; i++) {
			if(n % i == 0) {
				//System.out.print(i + " ");
				divisors.add(i);
			}
		}
		int sum = 0;
		for(int i=0; i<divisors.size();i++) {
			sum += divisors.get(i);
		}
		return sum;
	}
}
