package p1;
public abstract class Time2 implements StopWatch {
	protected int hours;
	protected int minutes;
	protected int seconds;
	
	public Time2() {
		
	}
	public Time2(int h, int m, int s) {
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
	abstract public void display();//abstract method
	
	public void StartTimer() {
		
		for(int i=0;i<TimerSeconds;i++) {
			System.out.println(TimerSeconds-i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	@Override
	public String toString() {
		return String.format(hours +":" +minutes+ ":"+seconds);
	}
	
	
}
class TwentyFrHrClock extends Time2{
	
	public TwentyFrHrClock(int h, int m, int s) {
		super(h,m,s);
	}
	public Time2 timeElapsed(int sec) {
		if(sec >= 60) {
			this.minutes += (sec/60);
			this.seconds = sec % 60;
		}
		//System.out.println(t.minutes);
		if(this.minutes >= 60) {
			this.hours += (this.minutes/60);
			this.minutes = this.minutes % 60;
		}
		return this;
	}
	@Override
	public void display() {
		timeElapsed(seconds);
		System.out.println("24 Hr Format - "+hours+":"+minutes+":"+seconds);
	}
}
class TwelveHrClock extends Time2{
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
}