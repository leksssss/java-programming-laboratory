/**
 * 
 */

/**
 * @author user
 *
 */
import java.util.Scanner;
public class SplitNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter a 5-digit number: ");
		int num=input.nextInt();
		int mod;
		int ans[]= {0,0,0,0,0};
		for(int i=0;i<5;i++) {
			mod=num%10;
			ans[4-i]=mod;
			num=num/10;
		}
		for(int i=0;i<5;i++)
			System.out.print(ans[i]+" ");
	}

}
