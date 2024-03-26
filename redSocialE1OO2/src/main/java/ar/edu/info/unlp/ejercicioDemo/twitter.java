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
	
	public user eliminateUser(String screenName) {
		user user = this.getUser(screenName);
		user.eliminateAllPosts();
		this.systemUsers.remove(user);
		return user;
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
	
	public tweet createPost(String msg, String screenName) {
		if((1<=msg.length()) && (msg.length()<280)) {
			System.out.print("tweet publicado");
			return this.getUser(screenName).createPost(msg);
		}else {
			System.out.println("su tweet tweet debe tener un minomo de 1 caracter y macimo de 280 caracteres");
			return null;
		}
		}
	
	public tweet rePost(tweet tweet, String sn) {
		this.getUser(sn).rePost(tweet);
		return tweet;
	}
}
