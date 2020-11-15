/**
 * 
 */

/**
 * @author user
 *
 */
import java.util.Scanner;
public class CircleOperations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the radius of circle: ");
		float r=input.nextFloat();
		float circum,area,dia;
		circum=2* (float)3.14*r;
		area=(float)3.14* r*r;
		dia=2*r;
		
		System.out.println("Circumference :"+circum);
		System.out.println("Area: "+area);
		System.out.println("Diameter: "+dia);
		
	}

}
