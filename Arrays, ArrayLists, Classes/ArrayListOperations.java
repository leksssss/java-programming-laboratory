import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<String> names= new ArrayList<String>();
		String name=input.nextLine();
		while(true) {
			if(name.equals("stop"))
				break;
			names.add(name);
			name=input.nextLine();
		}
		System.out.println("Number of students in class :"+names.size());
		for(String n: names)
			System.out.print(n +" ");
		System.out.println("\nEnter name to check:");
		String check_name=input.nextLine();
		boolean ans=names.contains(check_name);
		if(ans)
			System.out.println("The student's name is present");
		else
			System.out.println("The student name is absent");
		
		System.out.println("\nEnter name to remove :");
		check_name=input.nextLine();
		int index = names.indexOf(check_name);
		System.out.println("Student "+check_name+" present at index "+index);
		names.remove(index);
		System.out.println("After removal :");
		for(String n : names)	
			System.out.print(n +" ");
		//reversing names
		
		for(int i=0;i<names.size()/2;i++) {
			String temp=names.get(i);
			names.set(i, names.get(names.size()-i-1));
			names.set(names.size()-i-1, temp);
		}
		System.out.println("\nReversed array list :");
		for(String n : names)
			System.out.print(n +" ");
		input.close();
	}

}
