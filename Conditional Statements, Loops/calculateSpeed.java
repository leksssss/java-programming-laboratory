import java.util.Scanner;
public class calculateSpeed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter distance and time\n");
		int dist=input.nextInt();
		int hours=input.nextInt();
		int mins=input.nextInt();
		int sec=input.nextInt();
		
		int tot_sec=(hours*3600)+(mins*60)+sec;
		float speed=dist/tot_sec;
		System.out.println("Speed in m/s :"+speed);
		speed=(dist/1000)/(tot_sec/3600);
		System.out.println("Speed in km/h :"+speed);
		speed=(dist/1069)/(tot_sec/3600);
		System.out.println("Speed inmile/hr :"+speed);
	}

}
