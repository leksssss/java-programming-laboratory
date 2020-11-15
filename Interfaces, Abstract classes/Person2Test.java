import java.util.*;
import java.util.Collections;
public class Person2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person []pers = new Person[2];
		pers[0]=new FootBallPlayer("Barca",16,30,"Thanesh",18,168.3,45.0);
		pers[1]=new Cricketer("Shankar",25,168,72,"India","Bowler",30,230);
		//System.out.println("Number of goals :"+pers[0].getNoOfGoals()); Cannot access
		//System.out.println("Number of runs :"+pers[1].getRuns()); Cannot access
		
		FootBallPlayer fp = (FootBallPlayer) pers[0];
		Cricketer ck = (Cricketer) pers[1];
		System.out.println("Number of goals :"+fp.getNoOfGoals());
		System.out.println("Number of runs :"+ck.getRuns());
		
		ArrayList<FootBallPlayer> team =new ArrayList<FootBallPlayer>();
		team.add(new FootBallPlayer("Barca",1,60,"Neymar",30,157.8,70.0));
		team.add(new FootBallPlayer("Barca",6,100,"Messi",30,156.5,65.5));
		team.add(new FootBallPlayer("Manchester United",3,50,"Shan",20,164.3,55));
		team.add(new FootBallPlayer("Real Madrid",7,89,"Ronaldo",40,155.5,72));
		
		Collections.sort(team,new Comparator<FootBallPlayer>(){
			public int compare(FootBallPlayer a, FootBallPlayer b) {
				return a.getNoOfGoals() - b.getNoOfGoals();
			}
		});
		for(FootBallPlayer f : team) {
			System.out.println(f.toString());
		}
	}

}
