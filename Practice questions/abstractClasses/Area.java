package abstractClasses;

public class Area extends Shape{
	public int len;
	public int breadth;
	public int side;
	public double radius;
	
	Area(){
		
	}
	Area(int l, int b){
		this.len = l;
		this.breadth = b;
	}
	Area(int v){
		this.side = v;
	}
	Area(double r){
		this.radius = r;
	}
	
	@Override
	public void RectangleArea() {
		System.out.println("Area of rectangle : " + this.len * this.breadth);
	}
	
	public void SquareArea() {
		System.out.println("Area of Square : " + this.side * this.side);
	}
	
	public void CircleArea() {
		System.out.println("Area of Circle : " + 3.14*this.radius*this.radius);
	}
	
}
