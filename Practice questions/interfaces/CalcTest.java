package interfaces;
import java.util.Scanner;

public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int x = input.nextInt();
		MyCalculator test = new MyCalculator();
		System.out.println("\n"+ test.divisorSum(x));
		input.close();
	}

}
