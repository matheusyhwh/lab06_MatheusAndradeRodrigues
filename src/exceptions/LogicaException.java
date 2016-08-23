package exceptions;
/**
 * 
 * @author mathe
 *
 */
public class LogicaException extends Exception {
	private String msg;
	/**
	 * 
	 * @param msg
	 */
	public LogicaException(String msg) {
		this.msg = msg;
	}

	public String getMessage() {
		return msg;
	}
}
