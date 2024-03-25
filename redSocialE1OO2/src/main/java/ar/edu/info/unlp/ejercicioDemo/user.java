package ar.edu.info.unlp.ejercicioDemo;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class user {
	private List<post>tweets;
	private String screenName;
	
	public user(String screenName) {
		this.screenName = screenName;
		this.tweets = new ArrayList<post>();
	}
	
	public List<post> getPosts(){
		return this.tweets;
	}
	
	public post createPost(String msg) {
		post tweet = new tweet(this.screenName,msg); 
		this.tweets.add(tweet);
		return tweet;
	}
	
	public post rePost(tweet tweet) {
		post retweet = new reTweet(tweet,this.screenName);
		this.tweets.add(retweet);
		return retweet;
	}
	
	public String getScreenName() {
		return this.screenName;
	}
	public void eliminateAllPosts() {
		this.tweets = this.tweets.stream().map(tweet -> tweet = null).collect(Collectors.toList());
	}
}
