package lp2.lab06;

public class StringException extends Exception{
	private String msg;

	public StringException(String msg) {
		this.msg = msg;
	}

	public String getMessage() {
		return msg;
	}
	
	public boolean checkString(String string) {
		if (string == null || string.isEmpty()) {
			return true;
		} 
		return false;
	}
	
}
