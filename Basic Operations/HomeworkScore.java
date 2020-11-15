/**
 * 
 */

/**
 * @author user
 *
 */
import java.util.Scanner;
public class HomeworkScore {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter your mark: ");
		int mark=input.nextInt();
		while(mark<=0) {
			System.out.println("Please enter a valid mark!");
			mark=input.nextInt();
		}
		char grade;
		if(mark>90)
			grade='A';
		else if(mark>80 && mark<90)
			grade='B';
		else if(mark>70 && mark<80)
			grade='C';
		else if(mark>60 && mark<70)
			grade='D';
		else
			grade='E';
		System.out.println("You mark is "+mark+". Your grade is "+grade);
		
	}
}
