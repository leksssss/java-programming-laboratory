/**
 * 
 */

/**
 * @author user
 *
 */
import java.util.Scanner;
public class MailCompany {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		float weight;
		float handle=3;
		float cost;
		
		System.out.println("Hello! Enter the weight to be shipped or press -1 to exit ");
		weight=input.nextFloat();
		while(weight>0) {
			if(weight<=10) {
				cost=handle;
			}
			else {
				cost=handle+(weight-10);
			}
			System.out.print("Your shipping charge is: "+cost);
			weight=input.nextFloat();
			cost=0;
		}
	}

}
