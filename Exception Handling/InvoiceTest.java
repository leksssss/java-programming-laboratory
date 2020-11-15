import java.util.Scanner;
import java.util.InputMismatchException;
public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of objects : ");
		int n = input.nextInt();
		Invoice []i = new Invoice[n];
		for(int j=0; j<n ;j++) {
			System.out.print("Enter invoice number : ");
			String num = input.next();
			if(Integer.parseInt(num)<=0) 
				throw new InputMismatchException("Number can't be negative");
			System.out.print("Enter invoice description : ");
			String des = input.next();
			if(des.length()==0) 
				throw new InputMismatchException("Description can't be empty");
			System.out.print("Enter invoice quantity : ");
			int q = input.nextInt();
			System.out.print("Enter the price per item : ");
			double p = input.nextDouble();
			
			i[j] = new Invoice(num, des, q, p);
		}	
		
		System.out.print("Enter the number : ");
		while(true) {
			int k = input.nextInt();
			if(k==-1) break;
			try{
				if(k>=n)
					throw new ArrayIndexOutOfBoundsException("Enter a value less than "+n);
				if(k<0) 
					throw new ArrayIndexOutOfBoundsException("Enter a non-negative Number (-1 to quit): ");
				System.out.println(i[k].toString());
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e.toString());
			}
			
		}
		//System.out.print("The details of "+ k +"th invoice -");
		input.close();
	}

}
