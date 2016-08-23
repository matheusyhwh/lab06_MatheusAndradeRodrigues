package lp2.lab06;

public class LogicException extends Exception {
	private String msg;

	public LogicException(String msg) {
		this.msg = msg;
	}

	public String getMessage() {
		return msg;
	}
}
