package ar.edu.info.unlp.ejercicioDemo;

public class reTweet extends tweet{
	private tweet reference;
	
	public reTweet( tweet tweet,String user) {
		super(user,null);
		this.reference = tweet;
	}
	
	private String getReferenceMessage() {
		return this.reference.getTweet();
	}
	public void setTweet(tweet tweet) {
		this.reference = tweet;
	}

	@Override
	public String getTweet() {
		if(this.reference==null) {
			return this.getUserName()+" ReTweet de: post no disponible";
		}else {
		return this.getUserName()+" ReTweet de: post "+this.getReferenceMessage();
		}
		}
	
}
