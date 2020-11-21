package Package2;

public class Child implements Runnable {
	private Thread t;
	private String name;
	private Plate p;
	
	Child(String name,Plate p){
		this.name = name;
		this.p= p;
	}
	
	public void start() {
		if(t==null) {
			t = new Thread(this,name);
			t.start();
		}
	}
	
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Count :"+p.getc());
		}
	}
}
