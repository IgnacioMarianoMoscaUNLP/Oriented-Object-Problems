package ar.edu.info.unlp.ejercicioDemo;

public class tweet  {
		private String message;
		private String user;
		
		public tweet(String user, String msg) {
			this.message = msg;
			this.user=user;
		}
		
		private String getMessage() {
			return this.message;
		}
		
		public String getUserName() {
			return this.user;
		}
		
		public String getTweet() {
			return  "Tweet de "+this.getUserName()+" "+ this.getMessage();		
		}
}
