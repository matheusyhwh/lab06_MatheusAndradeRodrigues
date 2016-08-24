package exceptions;

public class StringNulaOuVaziaException extends Exception {
	private String msg;

	public StringNulaOuVaziaException(String msg) {
		this.msg = msg;
	}

	public String getMessage() {
		return msg;
	}

}
