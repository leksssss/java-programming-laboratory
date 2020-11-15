
abstract class Person {
	protected String name;
	protected int age;
	protected double height;
	protected double weight;
	
	public Person(String n, int a, double h, double w) {
		name = n;
		age = a;
		height = h;
		weight = w;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	@Override
	public String toString() {
		return String.format("\nName : "+name+"\nAge : "+age+ "\nHeight : "+height+"\nWeight : "+weight);
	}
	
}
class FootBallPlayer extends Person{
	
	public String teamname;
	public int uniformno;
	public int noofgoals;
	
	public FootBallPlayer(String team, int uni, int no,String n, int a, double h, double w) {
		super(n,a,h,w);
		teamname = team;
		uniformno = uni;
		noofgoals = no;
	}
	public int getNoOfGoals() {
		return noofgoals;
	}
	@Override
	public String toString() {
		return String.format("\nName : "+name+"\nAge : "+age+ "\nHeight : "+height+"\nWeight : "+weight + "\nTeam Name : "+teamname +"\nUniform No : "+uniformno+"\nNo. of goals : "+noofgoals);
	
	}
}

class Cricketer extends Person{
	
	public String country ;
	public String role;
	public int nowickets;
	public int noruns;
	
	public Cricketer(String n, int a , double h, double w, String c, String r, int wicket, int runs) {
		super(n,a,h,w);
		country = c;
		role = r;
		nowickets = wicket;
		noruns = runs;
	}
	public String getCountry() {
		return country;
	}
	public String getRole() {
		return role;
	}
	public int getWickets() {
		return nowickets;
	}
	public int getRuns() {
		return noruns;
	}
	
	@Override
	public String toString() {
		return String.format("Name : "+name+"\nAge : "+age+ "\nHeight : "+height+"\nWeight : "+weight + "\nCountry : "+country + "\nRole : "+role +"No. of wickets : "+nowickets+" No.of Runs : "+noruns);
	}
}
