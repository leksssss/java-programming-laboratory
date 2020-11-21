package Package2;

public class Mother extends Thread{
	private Thread t;
	private String name;
	private Plate p;
	
	Mother(String name,Plate p){
		this.name = name;
		this.p=p;
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
			try{
				Thread.sleep(50);
			}
			catch(InterruptedException e) {
				System.out.println("Interrupted Exception!");
			}
			p.inc();
		}
	}
}
