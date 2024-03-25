package ar.edu.info.unlp.ejercicioDemo;

public class tweet extends post {
		private String message;
		
		public tweet(String user, String msg) {
			super(user);
			this.message = msg;
		}
		
		private String getMessage() {
			return this.message;
		}
		public String getTweet() {
			return  "Tweet de "+this.getUserName()+" "+ this.getMessage();		
		}

		@Override
		public String getBody() {
			// TODO Auto-generated method stub
			return null;
		}
}
