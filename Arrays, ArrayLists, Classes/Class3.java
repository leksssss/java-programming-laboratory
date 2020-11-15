package Package2;
import Package1.Class1;
public class Class3 {
	public static void main(String args[]) {
		Class1 c=new Class1();
		c.display1();
		//c.display2();
		System.out.println("Display2 cant be accessed in Class3");
		//c.dispaly3();
		System.out.println("Display3 cant be accessed in class 3 ");
		
	}
}
