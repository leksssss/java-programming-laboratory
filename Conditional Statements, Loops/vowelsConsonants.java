import java.util.Scanner;
public class vowelsConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		char c=input.next().charAt(0);
		if(c=='a'|| c=='A'|| c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c== 'O' || c=='u' || c=='U') {
			System.out.println("Vowel");
		}
		else if((c>='A'&& c<='Z') || (c>='a' || c<='z')) {
			System.out.println("Consonant");
		}
		else 
			System.out.println("Error");
	}

}
