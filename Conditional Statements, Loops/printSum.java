import java.util.Scanner;
public class printSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number between 0 and 1000 (-1 to stop) ");
		int num=input.nextInt();
		int sum=0;
		while(num!=-1) {
			sum+=num;
			num=input.nextInt();
		}
		System.out.println("The sum is "+sum);
	}

}
