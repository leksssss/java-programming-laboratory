
public class Time {
	protected int hours;
	protected int minutes;
	protected int seconds;
	
	public Time() {
		
	}
	public Time(int h, int m, int s) throws IllegalArgumentException {
		if(s<0 || s>59) throw new IllegalArgumentException("Invalid value for seconds");
		if(m<0 || m>59) throw new IllegalArgumentException("Invalid value for minutes");
		if(h<0 || h>23) throw new IllegalArgumentException("Invalid value for hours");
		this.hours = h;
		this.minutes = m;
		this.seconds = s;
	}
	public void setHours(int h) throws IllegalArgumentException{
		if(h < 0 || h > 24 ) {
			throw new IllegalArgumentException("Hours not in range\n");
		}
		this.hours = h;
	}
	public void setMinutes(int m) throws IllegalArgumentException{
		if(m < 0 || m > 59) {
			throw new IllegalArgumentException("Minutes not in range\n");
		}
		this.minutes = m;
	}
	public void setSeconds(int s) throws IllegalArgumentException{
		if(s < 0 || s > 59) {
			throw new IllegalArgumentException("Seconds not in range\n");
		}
		this.seconds = s;
	}
	public String toString(Time t) throws IllegalArgumentException{
		return String.format("Hours : "+hours+" Minutes : "+minutes + " Seconds : "+seconds);
	}
	
}
