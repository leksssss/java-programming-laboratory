package Package2;

public class TestSync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plate p= new Plate();
		Mother m =new Mother("Mother",p);
		m.start();
		
		Child c = new Child("Child",p);
		c.start();
	}

}
