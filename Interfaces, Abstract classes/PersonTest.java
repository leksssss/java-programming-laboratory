
public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FootBallPlayer p1 = new FootBallPlayer("Barcelona",7,43,"Messi",37,168.0,70.0);
		System.out.print(p1.toString());
		FootBallPlayer p2 = new FootBallPlayer("\nArgentina",8,50,"Ronaldo",40,167.75,75.0);
		System.out.print(p2.toString());
		Cricketer p3 = new Cricketer("\nDhoni",40,175.1,60.0,"India","Wicket-Keeper,All-Rounder",45,870);
		System.out.print(p3.toString());
		Cricketer p4 = new Cricketer("\nSachin",50,159.9,80.1,"India","Batsman",20,1000);
		System.out.print(p4.toString());
		System.out.println("Get the no. of goals scored by Messi(p1) : "+p1.getNoOfGoals());
		System.out.println("Get the no. of goals scored by Ronaldo(p2) : "+p2.getNoOfGoals());
		System.out.println("The Role of Dhoni(p3) : "+p3.getRole());
		System.out.println("No. of wickets by Sachin (p4) : "+p4.getWickets() +" No.of runs scored : "+p4.getRuns());
		System.out.println("Total goals scored by p1 and p2 together : "+(p1.getNoOfGoals() + p2.getNoOfGoals()));
	}

}
