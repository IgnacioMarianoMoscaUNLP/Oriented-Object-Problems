package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class twitterTest {
	twitter twitter;
	post t;
	@BeforeEach
	void setUp() throws Exception{
		twitter = new twitter();
		twitter.setUser("tomas");
		twitter.setUser("joaquin");
		twitter.createPost("soy tomas", "tomas");
		t = twitter.createPost("soy joquin", "joaquin");
		twitter.rePost(t, "tomas");
	}
	
	@Test
	public void testScreenName() {
		assertFalse(twitter.setUser("tomas"));//ScreenName no unico, invalido
		assertTrue(twitter.setUser("santiago"));//ScreenName no unico, invalido
	}
	
	@Test
	public void testCreatePost() {
		assertEquals(null,twitter.createPost("", "tomas")); //post no valido, mensaje sin caracteres
		String msg="a";
		for (int i = 0; i < 280; i++) {
            msg = msg + "a";
        }
		assertEquals(null,twitter.createPost(msg, "tomas"));//mensaje mayor a 280 caracteres
		assertNotNull(twitter.createPost("messaje","joaquin"));//post con mensaje valido
	}
	
	@Test
	public void testEliminarUser() {
		assertNull(twitter.eliminateUser("joaquin")); //comprueba que se elimino joaquin
		assertEquals("ReTweet de tomas post no disponible",twitter.getUser("tomas").getPosts().get(1));// comprueba el repost de tomas de un tweet de joaquin, segun el body del re post
	}
}
