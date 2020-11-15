
abstract class Time {
	protected int hours;
	protected int minutes;
	protected int seconds;
	
	public Time() {
		
	}
	public Time(int h, int m, int s) {
		hours = h;
		minutes = m;
		seconds = s;
	}
	public int getHours() {
		return hours;
	}
	public int getMinutes() {
		return minutes;
	}
	public int getSeconds() {
		return seconds;
	}
	abstract void display();//abstract method
	
}
class TwentyFrHrClock extends Time{
	
	public TwentyFrHrClock(int h, int m, int s) {
		super(h,m,s);
	}
	public void timeElapsed(int sec) {
		if(sec >= 60) {
			minutes = sec / 60;
			seconds = sec % 60;
		}
		if(minutes >= 60) {
			hours = minutes / 60;
			minutes = minutes % 60;
		}
		
		//display();
	}
	@Override
	public void display() {
		timeElapsed(seconds);
		System.out.println("24 Hr Format - "+hours+":"+minutes+":"+seconds);
	}
}

class TwelveHrClock extends Time{
	public TwelveHrClock(int h, int m, int s) {
		super(h,m,s);
	}
	@Override 
	public void display() {
		if(seconds >= 60) {
			minutes = seconds / 60;
			seconds = seconds % 60;
		}
		if(minutes >= 60) {
			hours = minutes /60;
			minutes = minutes % 60;
		}
		if(hours > 12) {
			int extra_hour = hours -12;
			int extra_min = minutes;
			int extra_sec = seconds;
			System.out.println("12 Hr Format - "+extra_hour+":" +extra_min +":"+extra_sec + " P.M");
		}
		else {
			System.out.println("12 Hr Format - "+hours+":"+minutes+":"+seconds+" A.M");
		}
	}
	public int differenceTime(Time t1) {
		int sec1 = (t1.hours * 3600)+(t1.minutes * 60)+t1.seconds;
		int sec2 = (this.hours * 3600)+(this.minutes * 60)+this.seconds;
		return Math.abs(sec1 - sec2);
	}
}
