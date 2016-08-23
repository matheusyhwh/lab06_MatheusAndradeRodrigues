package exceptions;

public class ValorInvalidoException extends Exception{

		private String msg;
		
		public ValorInvalidoException(String msg){
			this.msg = msg;
		}
		
		public String getMessage(){
			return msg;
		}
	}
