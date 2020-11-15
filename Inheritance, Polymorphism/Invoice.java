import java.util.Scanner;
import java.util.Date;

public class Invoice {
	private String number;
	private String description;
	private int quantity = 0;
	private double price_per_item =0.0;
	private Date dateOfInvoice;
	
	public Invoice () {
		
	}
	public Invoice(String no, String desc, double price) {
		dateOfInvoice = new Date();
		number = no;
		description = desc;
		quantity = 0;
		price_per_item = price;
		
	}
	public Invoice(String no, String desc, int q, double price) {
		number =no;
		description = desc;
		quantity = q;
		price_per_item = price;
		dateOfInvoice = new Date();
	}
	public static double discount_rate = 0.2;
	
	public void setNumber(String no) {
		number = no;
	}
	public void getDesc(String desc) {
		description = desc;
	}
	public void getQuantity(int q) {
		quantity = q;
	}
	public void getPrice(double price) {
		price_per_item = price;
	}
	public String getNumber() {
		return number;
	}
	public String getDesc() {
		return description;
	}
	public int getQuantity() {
		return quantity;
	}
	public double getPrice() {
		return price_per_item;
	}
	public void getDiscount() {
		System.out.println("Discount Rate :"+discount_rate * 100 +"%");
	}
	
	public double displayTotal(Invoice []x) {
		double totalAmount = getInvoiceAmount(x) - calculateDiscount(x);
		return totalAmount;
	}
	public static double getInvoiceAmount(Invoice []x) {
		double amount = 0.0;
		for(Invoice i : x) {
			amount += i.getQuantity() * i.getPrice();
		}
		return amount;	
		
	}
	public static void modifyDiscountRate(double new_rate) {
		discount_rate = new_rate;
	}
	public static double calculateDiscount(Invoice []x) {
		double discountAmount = getInvoiceAmount(x) * discount_rate;
		return discountAmount;
	}
	public static void fillDetails(Invoice []x, int n) {
			Scanner input = new Scanner(System.in);
			for(int i=0;i<n;i++) {
				System.out.print("Enter part number : ");
				String no=input.next();
				System.out.print("Enter description:");
				String desc = input.next();
				System.out.print("Enter Quantity : ");
				int q = input.nextInt();
				System.out.print("Enter price per item :");
				double price = input.nextDouble();
				x[i] = new Invoice(no,desc,q,price);
			}
			input.close();
	}
	
	public static void printInvoiceWithDiscount(Invoice []x, double total) {
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		x[0].getDiscount();
		System.out.println("Total Discount Amount : " +calculateDiscount(x));
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Total Amount to be paid : "+total);
	}
	
	public static void printInvoice(Invoice []x,double total) {
		System.out.println("Invoice");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for(Invoice i :x) {
			System.out.println("Date of Invoice : "+ i.dateOfInvoice );
			System.out.println("Part Number : " + i.getNumber());
			System.out.println("Description : " + i.getDesc());
			System.out.println("Quantity  	: " + i.getQuantity());
			System.out.println("Price/item 	: "+ i.getPrice());
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.println("Total Invoice Amount : "+total);
	}
	
}
