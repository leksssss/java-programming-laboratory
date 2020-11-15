import java.util.Scanner;
public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Time t1 = new Time();
		t1 =Time.fillTime(t1);
		System.out.println(" ");
		Time t2 = new Time();
		t2 =Time.fillTime(t2);
		System.out.println(" ");
		
		if(t1.equals(t2)==0)
			System.out.println("Time1 is equal to Time2");
		else if(t1.equals(t2) == 1)
			System.out.println("Time1 is greater than Time 2");
		else
			System.out.println("Time 1 is lesser than Time 2");
		
		String  added_time = Time.addTime(t1,t2);
		System.out.println("After adding, the resultant time is - " + added_time );
		
		System.out.print("\nEnter your choice - 24hr(1) 0r 12hr(0) :");
		int option = input.nextInt();
		if(option == 1) {
			Time.print24Hour(t1);
		}
		else if(option == 0) {
			Time.print12Hour(t1);
		}
		else {
			System.out.println("Invalid Option");
		}
		input.close();
	}

}
