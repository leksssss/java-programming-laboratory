import java.util.Scanner;

public class InvoiceTest {
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of items :");
		int n = input.nextInt();
		Invoice invoice[] = new Invoice[n]; 
		Invoice.fillDetails(invoice,n);
		double total = Invoice.getInvoiceAmount(invoice);
		Invoice.printInvoice(invoice,total);
		if(total > 150) {
			System.out.println("Discount Applicable");
			
			total = invoice[0].displayTotal(invoice);
			Invoice.printInvoiceWithDiscount(invoice,total);
		}
	
		input.close();
	}
}
