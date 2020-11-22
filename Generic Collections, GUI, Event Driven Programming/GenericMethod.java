package p1;

public class GenericMethod {
	
	public static <E> boolean isEqualTo(E a, E b) {
		//compare
		if(a.equals(b))
			return true;
		else 
			return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2, b = 2;
		int c = 5, d = 15;
		double x = 4 ,y = 4.5;
		double u = 5.5, v = 5.5;
		String s1 = "Hi", s2 = "Hello", s3 = "oRange", s4 ="oRange";
		
		System.out.println("Comparison of two ints - \t" + a + "," + b + "\t"+ isEqualTo(a,b));
		System.out.println("Comparison of two ints - \t" + c + "," + d + "\t"+ isEqualTo(c,d));
		System.out.println("Comparison of two double -\t "+ x + "," + y +  "\t"+ isEqualTo(x,y));
		System.out.println("Comparison of two double -\t "+ u + "," + v +  "\t"+ isEqualTo(u,v));
		System.out.println("Comparison of two strings -\t "+ s1 + "," + s2 +"\t"+ isEqualTo(s1,s2));
		System.out.println("Comparison of two strings -\t "+ s3 + "," + s4 +"\t"+ isEqualTo(s3,s4));
		
	}

}
