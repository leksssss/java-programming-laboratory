import java.util.Scanner;
public class Time {
	private int hours;
	private int minutes;
	private int seconds;
	
	public Time() {
		
	}
	public Time(int h, int m, int s) {
		hours = h;
		minutes = m;
		seconds = s;
	}
	public int getSeconds() {
		return seconds;
	}
	public int getMins() {
		return minutes;
	}
	public int getHours() {
		return hours;
	}
	@Override
	public String toString() {
		//timeElapsed(seconds);
		//System.out.printf("Hours : %d \t Minutes : %d\t Seconds : %d\n",hours,minutes,seconds);
		return String.format(hours +":" +minutes+ ":"+seconds);
	}
	public static Time timeElapsed(int sec, Time t) {
		if(sec >= 60) {
			t.minutes += (sec/60);
			t.seconds = sec % 60;
		}
		//System.out.println(t.minutes);
		if(t.minutes >= 60) {
			t.hours += (t.minutes/60);
			t.minutes = t.minutes % 60;
		}
		return t;
	}
	public int equals(Time t) {
		Time tt = t;
		if(this.hours==tt.hours && this.minutes==tt.minutes && this.seconds==tt.seconds)
			return 0;
		else if(this.hours > t.hours)
			return 1;
		else if(this.hours > t.hours && this.minutes > tt.minutes)
			return 1;
		else if(this.hours > t.hours && this.minutes > tt.minutes && this.seconds > tt.seconds)
			return 1;
		else
			return -1;
	}
	public static Time fillTime(Time t) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the time details :");
		System.out.print("Hours :");
		int h = input.nextInt();
		System.out.print("Minutes : ");
		int m = input.nextInt();
		System.out.print("Seconds : ");
		int s = input.nextInt();
		t = new Time(h,m,s);
		System.out.print("Time - ");
		Time tt = timeElapsed(t.seconds,t);
		System.out.println(tt.toString());
		return tt;
		//input.close();
	}
	
	public static String addTime(Time t1, Time t2) {
		Time newTime = new Time();
		newTime.hours = t1.hours + t2.hours;
		newTime.minutes = t1.minutes + t2.minutes;
		newTime.seconds = t1.seconds + t2.seconds;
		//System.out.println(newTime.hours+ ","+newTime.minutes+","+newTime.seconds);
		newTime = timeElapsed(newTime.seconds,newTime);
		
		String ntime = newTime.toString();
		//System.out.println(ntime);
		return ntime;
	}
	public static void print24Hour( Time t) {
		//t = timeElapsed(t.seconds,t);
		System.out.println("Time 1 in 24-Hour Format - "+ t.toString());
	}
	public static void print12Hour(Time t) {
		int s = t.seconds;
		//t = timeElapsed(s,t);
		if(t.hours > 12) {
			int extra_hour = t.hours -12;
			int extra_min = t.minutes;
			int extra_sec = t.seconds;
			Time resultant_time = new Time(extra_hour, extra_min,extra_sec);
			System.out.println("Time 1 in 12-Hour Format - "+ resultant_time.toString()+"P.M");
			return;
		}
		System.out.println("Time 1 in 12-Hour Format - "+ t.toString()+"A.M");
	}
	
	
	
}
	
	
	
	