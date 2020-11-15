
public class CustomEmptyException extends Exception {
private String msg;
	
	CustomEmptyException(){
		msg="";
	}
	
	CustomEmptyException(String message){
		msg=message;
	}
	
	@Override
	public String getMessage() {
		return this.msg;
	}
	
	@Override
	public String toString() {
		return CustomEmptyException.class.getName() +" : "+getMessage();
	}
}
