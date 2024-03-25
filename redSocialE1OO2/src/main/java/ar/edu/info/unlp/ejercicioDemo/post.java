package ar.edu.info.unlp.ejercicioDemo;

public abstract class post {
	private  String user;
	
	public post(String user) {
		this.user = user;
	}
	public String getUserName() {
		return this.user;
	}
	
	public abstract String getBody();
}
