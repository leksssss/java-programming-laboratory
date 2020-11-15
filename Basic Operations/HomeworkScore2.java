
/**
 * 
 */

/**
 * @author user
 *
 */
public class HomeworkScore2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark1=Integer.parseInt(args[0]);
		int mark2=Integer.parseInt(args[1]);
		int mark3=Integer.parseInt(args[2]);
		int mark4=Integer.parseInt(args[3]);
		int mark5=Integer.parseInt(args[4]);
		char grade;
		float avg=(mark1+mark2+mark3+mark4+mark5)/5;
		
		if(avg>90)
			grade='A';
		else if(avg>80 && avg<90)
			grade='B';
		else if(avg>70 && avg<80)
			grade='C';
		else if(avg>60 && avg<70)
			grade='D';
		else
			grade='E';
		System.out.println("You average mark is "+avg+". Your grade is "+grade);
	}

}
