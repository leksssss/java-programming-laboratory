package p1;

public class Time2Test {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			TwentyFrHrClock t1 = new TwentyFrHrClock(18,47,80);
			TwelveHrClock t2 = new TwelveHrClock(16,50,30);
			System.out.print("Time 1 - ");
			t1.display();
			System.out.print("Time 2 - ");
			t2.display();
			TwentyFrHrClock t3 = new TwentyFrHrClock(0,30,1698);
			System.out.print("Time 3 - ");
			t3.display();
			System.out.print("\nTime elapsed for Time 3 is ");
			t3.timeElapsed(t3.seconds);
			t3.display();
			System.out.println("STOP WATCH");
			t3.StartTimer();
		}

}
