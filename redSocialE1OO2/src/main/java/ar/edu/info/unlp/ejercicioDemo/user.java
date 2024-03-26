package ar.edu.info.unlp.ejercicioDemo;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class user {
	private List<tweet>tweets;
	private String screenName;
	
	public user(String screenName) {
		this.screenName = screenName;
		this.tweets = new ArrayList<tweet>();
	}
	
	public List<tweet> getPosts(){
		return this.tweets;
	}
	
	public tweet createPost(String msg) {
		tweet tweet = new tweet(msg,this.screenName); 
		this.tweets.add(tweet);
		return tweet;
	}
	
	public tweet rePost(tweet tweet) {
		tweet retweet = new reTweet(tweet,this.screenName);
		this.tweets.add(retweet);
		return retweet;
	}
	
	public String getScreenName() {
		return this.screenName;
	}
	public void eliminateAllPosts() {
		this.tweets.clear();
	}
}
