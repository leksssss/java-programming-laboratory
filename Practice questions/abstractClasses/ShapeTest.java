package abstractClasses;
import java.util.Scanner;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the choice \t 1. Rectangle \t2.Square \t3.Circle ");
		int x = input.nextInt();
		switch(x) {
		case 1: System.out.println("Enter length :");
				int l = input.nextInt();
				System.out.println("Enter breadth : ");
				int b = input.nextInt();
				Area rect =  new Area(l,b);
				rect.RectangleArea();
				break;
		case 2: System.out.println("Enter side : ");
				int s = input.nextInt();
				Area sq = new Area(s);
				sq.SquareArea();
				break;
		case 3: System.out.println("Enter radius : ");
				double r = input.nextDouble();
				Area cir = new Area(r);
				cir.CircleArea();
				break;
		}
		input.close();
	}

}
