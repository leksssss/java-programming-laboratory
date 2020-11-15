import java.util.Scanner;
public class increasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter 3 numbers:");
		int num1=input.nextInt();
		int num2=input.nextInt();
		int num3=input.nextInt();
		
		if(num1>num2 && num2>num3) {
			System.out.println("Numbers are decreasing order.");
		}
		else if(num1<num2 && num2<num3)
			System.out.println("Numbers are increasing order");
		else 
			System.out.println("Neither increasing nor decreasing");
	}

}
