package ar.edu.unlp.info.oo2.mediaPlayerEjer5OO2;

import java.util.List;
import java.util.ArrayList;

public class MediaPlayer {
	private List<Media> media;
	
	public MediaPlayer() {
		this.media =new ArrayList<Media>(); 
	}
	
	public void play() {
		this.media.stream().forEach( m-> m.play());
	}
	
	public void addMedia(Media media) {
		this.media.add(media);
	}
}
