package classesAndObjects;

import java.util.Scanner;

public class HolidayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//Get input
		Holiday[] hols = new Holiday[3];
		for(int i=0; i<3; i++) {
			System.out.print("Enter Holiday name : ");
			String h_name = input.next();
			System.out.print("Enter Holiday date : ");
			int h_day = input.nextInt();
			System.out.print("Enter Holiday month : ");
			String h_month = input.next();
			hols[i] = new Holiday(h_name, h_day, h_month);
		}
		
		System.out.println("The average date of all holidays : " + Holiday.avgDate(hols));
		
		System.out.println("First Holiday details :" + hols[0].toString());
		System.out.println("Second Holiday details : " + hols[1].toString());
		if( Holiday.inSameMonth(hols[0],hols[1]) ) {
			System.out.println("They fall under same month");
		}
		else {
			System.out.println("They do not fall under same month");
		}
		
		System.out.println( Holiday.createHoliday() );
		input.close();
	}

}
