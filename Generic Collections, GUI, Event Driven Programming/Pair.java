package p1;

public class Pair<F, S> {
	private F first;
	private S second;
	
	Pair() {
		
	}
	
	Pair(F f, S s){
		this.first = f;
		this.second = s;
	}
	
	public void setFirst(F f) {
		this.first = f;
	}

	public void setSecond(S s) {
		this.second = s;
	}
	
	public F getFirst() {
		return this.first;
	}
	
	public S getSecond() {
		return this.second;
	}
}
