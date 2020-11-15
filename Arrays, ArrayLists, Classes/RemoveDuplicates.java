import java.util.Scanner;
import java.util.ArrayList;
public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> duplicates=new ArrayList<Integer>();
		System.out.print("Enter the number of elements:");
		int n = input.nextInt();
		System.out.print("Enter the elements");
		for(int i=0;i<n;i++) {
			int x = input.nextInt();
			duplicates.add(x);
		}
		duplicates=removeDuplicates(duplicates);
		for(int i=0;i<duplicates.size();i++)
			System.out.print(duplicates.get(i)+" ");
		input.close();
	}
	
	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> duplicates) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i=0; i<duplicates.size(); i++) {
			if(result.contains(duplicates.get(i)))
				continue;
			else
				result.add(duplicates.get(i));
		}
		return result;
	}
}
