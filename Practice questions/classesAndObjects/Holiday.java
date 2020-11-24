package classesAndObjects;

public class Holiday {
	/*
	An object of class Holiday represents a holiday during the year. This class has three instance variables:
	● name, which is a String representing the name of the holiday
	● day, which is an integer representing the day of the month of the holiday
	● month, which is a String representing the month the holiday is in
	
	1.a method inSameMonth, which compares two instances of the class Holiday, 
	and returns the Boolean value true if they have the same month, and false if they do not.
	
	2.a method avgDate which takes an array of base type Holiday as its argument, and
	returns a double that is the average of the day variables in the Holiday instances in the
	array. You may assume that the array is full (i.e. does not have any null entries).
	
	3.a piece of code that creates a Holiday instance with the name “Independence Day”,
	with the day “15”, and with the month “August”.
	*/
	
	private String name;
	private int day;
	private String month;
	
	Holiday(){
		
	}
	
	public Holiday(String n, int d, String m) {
		this.name = n;
		this.day = d;
		this.month = m;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getDay() {
		return this.day;
	}
	
	public String getMonth() {
		return this.month;
	}
	
	public static boolean inSameMonth(Holiday h1, Holiday h2) {
		if(h1.month == h2.month) {
			return true;
		}
		return false;
	}
	
	public static double avgDate(Holiday []h) {
		double avg;
		int sum = 0;
		for(int i=0; i<h.length; i++) {
			sum += h[i].getDay();
		}
		avg = sum/h.length;
		return avg;
	}
	
	public static String createHoliday() {
		String h_name = "Independence Day";
		int h_day = 15;
		String h_month = "August";
		
		Holiday new_holiday = new Holiday(h_name, h_day, h_month);
		return new_holiday.toString();
	}
	
}
