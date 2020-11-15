public class Invoice implements TaxCalculator {
	private String number;
	private String description;
	private int quantity;
	private double price;
	private static double rate=0.04;
	
	Invoice(){
		number ="";
		description="";
		quantity=0;
		price=0.0;
	}
	
	Invoice(String number,int quantity,double price){
		this.number = number;
		this.description="";
		this.quantity=quantity;
		this.price=price;
	}
	
	Invoice(String number,String desc,int quantity,double price){
		this.number = number;
		this.description=desc;
		this.quantity=quantity;
		this.price=price;
	}
	
	public double calculateTax() {
		return this.displayTotal() * salestaxrate; 
	}
	
	public void setNumber(String number) {
		this.number=number;
	}
	
	public String getNumber() {
		return this.number;
	}
	
	public void setDescription(String desc) {
		this.description=desc;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setQuantity(int q) {
		quantity=q;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public void setPrice(double p) {
		this.price=p;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public double getInvoiceAmount() {
		return this.price * this.quantity;
	}
	
	public void display() {
		System.out.printf("Id: %s \nDescription : %s\nQuantity : %d\nPrice :%f\n",getNumber(),getDescription(),getQuantity(),getPrice());
		System.out.println();
	}
	
	public double displayTotal() {
		return this.getInvoiceAmount()- this.calculateDiscount();
	}
	
	public double calculateDiscount() {
		return this.getInvoiceAmount() * rate;
	}
	
	public static void modifyDiscountRate(double rate) {
		Invoice.rate=rate;
	}
	public static double getDiscountRate() {
		return rate;
	}
}
