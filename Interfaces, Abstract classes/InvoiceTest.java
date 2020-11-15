import java.util.Scanner;
public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the id: ");
		String number = input.next();
		
//		System.out.println();
		String desc = input.nextLine();
		System.out.print("Enter the Description: ");
		desc = input.nextLine();
		
		System.out.print("Enter the quantity: ");
		int quantity = input.nextInt();
		
		System.out.print("Enter the price of the single item: ");
		double price= input.nextDouble();
		
		Invoice in1 = new Invoice(number,desc,quantity,price);
		in1.display();
		System.out.printf("Total amount is: %.2f\n",in1.getInvoiceAmount());
		System.out.printf("Discount amount is: %.2f\n",in1.calculateDiscount());
		System.out.printf("The total amount after discount: %.2f\n",in1.displayTotal());
		
		System.out.println();
		
		Invoice.modifyDiscountRate(0.16);
		System.out.printf("New discount rate is: %.2f\n",Invoice.getDiscountRate());
		
		System.out.println();
		System.out.printf("Discount amount is: %.2f\n",in1.calculateDiscount());
		System.out.printf("Total amount after discount: %.2f\n",in1.displayTotal());
		System.out.printf("The tax amount is: %.2f\n",in1.calculateTax());
		System.out.printf("The total amount after discount and adding tax: %.2f",in1.displayTotal()+in1.calculateTax());
		
		input.close();
	}

}
