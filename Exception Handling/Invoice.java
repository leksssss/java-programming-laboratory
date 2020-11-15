import java.util.InputMismatchException;
public class Invoice {
	private String number;
	private String description;
	private int quantity ;
	private double price_per_item;
	
	public Invoice() {
		
	}
	public Invoice(String number,String desc,int quantity,double price) throws InputMismatchException{
		this.number = number;
		this.description=desc;
		this.quantity=quantity;
		this.price_per_item=price;
	}
	
	public void setNumber(String number) throws CustomEmptyException{
		if(number.length() == 0) 
			throw new CustomEmptyException("PartNumber can't be empty");
		if(Integer.parseInt(number) < 0)
			throw new InputMismatchException("Number can't be negative");
		this.number=number;
	}
	
	public void setDescription(String desc){
		if(desc.length()==0) 
			throw new InputMismatchException("Description can't be empty");
		this.description=desc;
	}
	
	public void setQuantity(int q){
		this.quantity=q;
	}
	public void setPrice(double p){
		this.price_per_item = p;
	}
	@Override
	public String toString() {
		return String.format("Number" + number +" Description : "+description + " Quantity : "+quantity+"Price per item :"+price_per_item);
	}
}
