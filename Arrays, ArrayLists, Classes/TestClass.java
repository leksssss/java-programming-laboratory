package Package1;

public class TestClass {
	
	public static void getClass1() {
		int num;
		String s;
		double f;;
		Class1 c = new Class1();
		System.out.println("Class 1 :");
		//num = c.x;
		System.out.println("x is not accessible");
		s = c.name;
		System.out.println("name from class1 :"+s);
		f = c.y;
		System.out.println("y from class1 :"+ f);
		c.display1();
		c.display2();
		//c.display3();
		System.out.println("Display3 from class1 not accessible\n");
	}
	
	public static void getClass2() {
		int num;
		String s;
		double f;;
		Class2 c = new Class2();
		System.out.println("Class 2 :");
		num = c.x;
		System.out.println("x from Class 2 :" + num);
		s = c.name;
		System.out.println("name from class 2 :"+s);
		//f = c.y;
		System.out.println("y is not accessible");
		c.display1();
		c.display2();
		//c.display3();
		System.out.println("Display3 from class2 not accessible\n");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getClass1();
		System.out.print("\n");
		getClass2();

	}

}
