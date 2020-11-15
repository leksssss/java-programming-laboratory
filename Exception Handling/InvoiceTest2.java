import java.util.InputMismatchException;
import java.util.Scanner;
public class InvoiceTest2 {

	public static void main(String[] args) throws CustomEmptyException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int q;
		String des,num;
		double p;
		while(true) {
			try {
				System.out.print("Enter invoice number : ");
				num = input.nextLine();
				if(num.length() == 0) 
					throw new CustomEmptyException("Number can't be empty");
				if(Integer.parseInt(num) < 0)
					throw new InputMismatchException("Number can't be negative");
				break;
			}
			catch(InputMismatchException e) {
				System.out.println(e.toString());
			}
		}
		while(true) {
			try {
				System.out.print("Enter invoice description : ");
				des = input.nextLine();
				if(des.length() == 0) 
					throw new CustomEmptyException("Description can't be empty");
				
				break;
			}
			catch(InputMismatchException e) {
				System.out.println(e.toString());
			}
		}
		while(true) {
			try {
				System.out.print("Enter invoice quantity : ");
				q = input.nextInt();
				if(q <= 0) {
					throw new InputMismatchException("Quantity can't be negative");
				}
				break;
			}
			catch(InputMismatchException e) {
				System.out.println(e.toString());
			}
		}
		while(true) {
			try {
				System.out.print("Enter the price per item : ");
				p = input.nextDouble();
				if(p <= 0.0) {
					throw new InputMismatchException("Price can't be negative");
				}
				break;
			}
			catch(InputMismatchException e) {
				System.out.println(e.toString());
			}
		}
		Invoice x = new Invoice(num,des,q,p);
		System.out.print(x.toString());
		input.close();
}}
