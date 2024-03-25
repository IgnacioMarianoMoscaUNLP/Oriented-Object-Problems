package ar.edu.info.unlp.ejercicioDemo;

import java.util.List;
import java.util.ArrayList;

public class twitter {
	private List<user>systemUsers;
	
	public twitter() {
		this.systemUsers = new ArrayList<user>();
	}
	private Boolean uniqueScreenName(String sn) {
		return this.systemUsers.stream().anyMatch(t->t.getScreenName()==sn);
	}
	
	public user eliminateUser(String sn) {
		user r = this.getUser(sn);
		r.eliminateAllPosts();
		int i;
		for(i=0;i<this.systemUsers.size();i++) {
			if(this.systemUsers.get(i).getScreenName()==sn) {
				this.systemUsers.remove(i);
				return null;
			}
		}
		return null;
	}
	
	public Boolean setUser(String screenName) {
		if(this.uniqueScreenName(screenName)) {
			System.out.println("Nombre de usuario existente, pruebe con otro");	
			return false;
		}else {
			user u = new user(screenName);
			this.systemUsers.add(u);
			System.out.println("Se creo el usuario "+screenName);	
			return true;
		}
	}
	
	public user getUser(String sn) {
		return this.systemUsers.stream().filter(t->t.getScreenName().equals(sn)).findFirst().orElse(null);
	}
	
	public post createPost(String msg, String screenName) {
		if((1<=msg.length()) && (msg.length()<280)) {
			post t = this.getUser(screenName).createPost(msg);
			System.out.print("tweet publicado");
			return t;
		}else {
			System.out.println("su tweet tweet debe tener un minomo de 1 caracter y macimo de 280 caracteres");
			return null;
		}
		}
	
	public post rePost(post tweet, String sn) {
		tweet passTweet= new tweet(tweet.getBody(),tweet.getUserName());
		post tw = new reTweet(passTweet,sn);
		passTweet = null;
		return tw;
	}
}
