import java.util.Scanner;
public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Time t= new Time();		
		int hour;
		while(true) {
			System.out.print("Enter the hours (0-23): ");
			hour=input.nextInt();
			try {
				t.setHours(hour);
				break;
			}
			catch(IllegalArgumentException e) {
				System.out.println(e.toString());
			}
		}
		
		int mins;
		while(true) {
			System.out.print("Enter the minutes (0-59): ");
			mins=input.nextInt();
			try {
				t.setMinutes(mins);
				break;
			}
			catch(IllegalArgumentException e) {
				System.out.println(e.toString());
			}
		}
		
		int secs;
		while(true) {
			System.out.print("Enter the seconds (0-59): ");
			secs=input.nextInt();
			try {
				t.setSeconds(secs);
				break;
			}
			catch(IllegalArgumentException e) {
				System.out.println(e.toString());
			}
		}
		
		t.toString();
	
		
		input.close();
	}

}
