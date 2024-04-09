package ar.edu.unlp.info.oo2.Topografia.copy;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;

public class TopografiaTest {
	
	List<Topografia> lista;
	List<Topografia> lista2;
	Topografia tierra;
	Topografia agua;
	Topografia mixta1;
	Topografia mixta2;
	Topografia mixta3;
	@BeforeEach
	void setUp() throws Exception{
		tierra = new Tierra();
		agua = new Agua();
		lista = new ArrayList<Topografia>();
		lista.add(agua);
		lista.add(tierra);
		lista.add(tierra);
		lista.add(agua);
		mixta1 = new Mixta(lista);
		lista2=lista;
		mixta2 = new Mixta(lista2);
		
	}
	
	@Test
	public void testIgual() {
			assertTrue(mixta1.igual(mixta2));
			assertFalse(agua.igual(tierra));
			assertFalse(agua.igual(mixta1));
			
			
			lista.clear();
			lista.add(agua);
			lista.add(tierra);
			lista.add(agua);
			lista.add(tierra);
			mixta3 = new Mixta(lista);
			//mismas proporciones
			assertFalse(mixta1.igual(mixta3));
	}
}

	
	

