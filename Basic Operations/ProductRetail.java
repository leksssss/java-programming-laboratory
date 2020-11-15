/**
 * 
 */

/**
 * @author user
 *
 */
import java.util.Scanner;
public class ProductRetail {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		double price=0;
		int product_no,quantity;
		System.out.println("Enter -1 to exit");
		System.out.print("Product number: ");
		product_no=input.nextInt();
		System.out.print("Quantity: ");
		quantity=input.nextInt();
		while(product_no>=0 && product_no<=5 && quantity>=0) {
			switch(product_no) {
			case 1:{
				price=2.98;
				break;
			}
			case 2:{
				price=4.50;
				break;
			}
			case 3:{
				price=9.98;
				break;
			}
			case 4:{
				price=4.49;
				break;
			}
			case 5:{
				price=6.87;
				break;
			}
		}
			System.out.println("Total cost: Rs."+price*quantity);
			System.out.print("Product number: ");
			product_no=input.nextInt();
			System.out.print("Quantity: ");
			quantity=input.nextInt();
	}
}
}
