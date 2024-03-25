package ar.edu.info.unlp.ejercicioDemo;

public class reTweet extends post{
	private tweet reference;
	
	public reTweet( tweet tweet,String user) {
		super(user);
		this.reference = tweet; 
	}
	
	private String getReferenceMessage() {
		return this.reference.getTweet();
	}
	
	public String getBody() {
		if(this.reference==null) {
			return "ReTweet de "+this.getUserName()+ " post no disponible";
		}
		return "ReTweet de "+this.getUserName()+ " post "+this.getReferenceMessage();
	}
	
}
