package lp2.lab06;

public class ValueException extends Exception{

		private String msg;
		
		public ValueException(String msg){
			this.msg = msg;
		}
		
		public String getMessage(){
			return msg;
		}
	}
