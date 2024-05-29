package ar.edu.unlp.info.oo2.DataBase;
import ar.edu.unlp.info.oo2.DataBaseAccess.*;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.rules.ExpectedException;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class DataBaseAccessTest {
	DataBaseReal db;
	ProxySecurityDataBaseAccess proxy;
	ExpectedException thrown;
	
	@BeforeEach
	void setUp() throws Exception{
		db = new DataBaseReal();
		proxy = new ProxySecurityDataBaseAccess(db);
		
	}
	
	@Test
	public void testLogWright() {
		assertTrue(proxy.log("objetosDos"));		
	}
	@Test
	public void testLogWrongt() {
		assertFalse(proxy.log("sDos"));		
	}
	@Test
	public void testinsertNeRowUnauthorizated() {
		// Declaración e inicialización en una sola línea
		String[] nombres = {"Alice", "Bob", "Charlie"};
		assertEquals(-1,proxy.insertNewRow(nombres));
	}
	@Test
	public void testinsertNeRowAuthorizated() {
		// Declaración e inicialización en una sola línea
		proxy.log("objetosDos");
		String[] nombres = {"Alice", "Bob", "Charlie"};
		assertNotEquals(-1,proxy.insertNewRow(nombres));
	}
	
}

	
	

