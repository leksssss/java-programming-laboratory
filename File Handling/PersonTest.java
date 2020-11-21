import java.io.IOException;

public class PersonTest {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		FootBallPlayer p1 = new FootBallPlayer("Barcelona",7,43,"Messi",37,168.0,70.0);
		System.out.print(p1.toString());
		
		System.out.println("\n");
		
		Cricketer p2 = new Cricketer("Dhoni",40,175.1,60.0,"India","Wicket-Keeper,All-Rounder",45,870);
		System.out.print(p2.toString());

		System.out.println("\n");
		System.out.println("Get the no. of goals scored by Messi(p1) : "+p1.getNoOfGoals());
		System.out.println("The Role of Dhoni(p3) : "+p2.getRole());
		
		p1.writeIntoFile();
		p2.writeIntoFile();
		
		
	}

}



