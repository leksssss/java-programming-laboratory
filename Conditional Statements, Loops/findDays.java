import java.util.Scanner;

public class findDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the month :");
		String month= input.nextLine();
		int days;
		switch(month) {
		case "January": days=31;
						break;
		case "February":days=28;
						break;
		case "March" : days=31;
						break;
		case "April" : days=30;
						break;
		case "May" : days=31;
					break;
		case "June" : days=30;
					break;
		case "July" : days=31;
					break;
		case "August" : days=31;
						break;
		case "September" : days=30;
							break;
		case "October" : days=31;
						break;
		case "November" : days=30;
							break;
		case "December" : days=31;
							break;
		default: days=-1;
		}
		System.out.println("The number of days in"+ month+ ":"+ days +"days.\n");
	}

}
