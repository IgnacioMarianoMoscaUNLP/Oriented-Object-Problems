package ar.edu.unlp.info.oo2.mediaPlayerEjer5OO2;

public class VideoStreamAdapter extends Media{
	private VideoStream videoStream;
	public VideoStreamAdapter() {
		this.videoStream = new VideoStream();
	}
	public void play() {
	  this.videoStream.reproduce();
 }
}
