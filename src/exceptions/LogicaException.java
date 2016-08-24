package exceptions;

public class LogicaException extends Exception {
	private String msg;

	public LogicaException(String msg) {
		this.msg = msg;
	}

	public String getMessage() {
		return msg;
	}
}
