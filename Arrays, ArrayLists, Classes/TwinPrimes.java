import java.util.ArrayList;
import java.util.Scanner;
public class TwinPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a range :");
		int n = input.nextInt();
		ArrayList<Integer> prime = new ArrayList<Integer>();
		//ArrayList<Integer> res= new ArrayList<Integer>();
		for(int i=2; i<n; i++) {
			if(isPrime(i))
				prime.add(i);
		}
		for(int i=0; i<prime.size()-1; i++) {
			if((prime.get(i+1)-prime.get(i))==2) {
				System.out.println(prime.get(i) + "," + prime.get(i+1));
			}
		}
		input.close();
	}
	
	public static boolean isPrime(int num) {
		for(int i=2; i<num; i++) {
			if(num % i == 0 )
				return false;
		}
		return true;
	}
}
