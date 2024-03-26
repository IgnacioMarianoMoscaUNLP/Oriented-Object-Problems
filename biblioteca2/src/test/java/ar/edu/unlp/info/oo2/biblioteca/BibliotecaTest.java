package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.json.simple.parser.*;

public class BibliotecaTest {
	Biblioteca biblioteca;
	@BeforeEach
	void setUp() throws Exception{
		biblioteca = new Biblioteca();
		biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));
		biblioteca.setExporter(new JsonSimpleAdapter());
	}
	
	@Test
	public void testExportarSocios() throws ParseException {
		JSONParser parser = new JSONParser();
		assertTrue(parser.parse(this.biblioteca.exportarSocios()).toString().contains("Arya Stark"));
		assertTrue(parser.parse(this.biblioteca.exportarSocios()).toString().contains("needle@stark.com"));
		assertTrue(parser.parse(this.biblioteca.exportarSocios()).toString().contains("5234-5"));
		assertTrue(parser.parse(this.biblioteca.exportarSocios()).toString().contains("Tyron Lannister"));
		assertTrue(parser.parse(this.biblioteca.exportarSocios()).toString().contains("tyron@thelannisters.com"));
		assertTrue(parser.parse(this.biblioteca.exportarSocios()).toString().contains("2345-2"));
	}
	
	
}
