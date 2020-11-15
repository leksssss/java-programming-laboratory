/**
 * 
 */

/**
 * @author user
 *
 */
import java.util.Scanner;
public class DrivingCost {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		float total_km,cost_pl,avg_km_pl;
		int parking_fee,tolls;
		
		System.out.print("Total km driven per day: ");
		total_km=input.nextFloat();
		System.out.print("Cost per litre of fuel: Rs.");
		cost_pl=input.nextFloat();
		System.out.print("Average km per litre: ");
		avg_km_pl=input.nextFloat();
		System.out.print("Parking fees per day: Rs.");
		parking_fee=input.nextInt();
		System.out.print("Tolls per day: ");
		tolls=input.nextInt();
		System.out.print("The cost of each toll is Rs.50");
		
		float total_cost=0;
		float fuel_cost=(total_km/avg_km_pl)*cost_pl;
		total_cost=fuel_cost+parking_fee+(tolls*50);
		System.out.println("Your total cost of driving per day is Rs."+total_cost);
	}

}
