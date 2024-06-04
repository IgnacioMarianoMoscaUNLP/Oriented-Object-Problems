package ar.edu.unlp.info.oo2.JuegoDeRol;
import ar.edu.unlp.info.oo2.JuegoRol.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JuegoDeRolTest {
	Personaje guerrero;
	Personaje arquero;
	Personaje mago;
	concreteCreatorGuerrero creatorGuerrero;
	concreteCreatorArquero creatorArquero;
	concreteCreatorMago creatorMago;
	
	
	@BeforeEach
	void setUp() throws Exception{
		creatorArquero = new concreteCreatorArquero();
		creatorGuerrero = new concreteCreatorGuerrero();
		creatorMago = new concreteCreatorMago();
		
		guerrero = creatorGuerrero.creadorPersonaje("Link");
		arquero = creatorArquero.creadorPersonaje("Legolas");
		mago = creatorMago.creadorPersonaje("Gandalf");
	}
	
	@Test
	public void testAttackEspadaACuero() {
			
		System.out.println(arquero.getVida());
		guerrero.Atacar(arquero);
			
			assertEquals(92,arquero.getVida());
			
	}
	@Test
	public void testAttackArco() {
			arquero.Atacar(guerrero);
			assertEquals(98,guerrero.getVida());
			arquero.Atacar(mago);
			assertEquals(95,mago.getVida());
	}
	@Test
	public void testAttackBaston() {
			mago.Atacar(guerrero);
			assertEquals(99,guerrero.getVida());
			mago.Atacar(arquero);
			assertEquals(98,arquero.getVida());
	}
	@Test
	public void testAttackImposibleNoLife() {
			mago.setVida(0);
			mago.Atacar(arquero);
	}
	

}

	
	

