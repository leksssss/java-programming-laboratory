package Package2;

public class Plate {
public int count=0;
	
	public void inc() {
		synchronized(this){
			this.count++;
			notify();
		}
	}
	
	public int getc() {
		synchronized(this) {
			try{
				wait();
			}
			catch(InterruptedException e) {
				System.out.println("Interuppted!");
			}
		}
		return count;
	}
}
