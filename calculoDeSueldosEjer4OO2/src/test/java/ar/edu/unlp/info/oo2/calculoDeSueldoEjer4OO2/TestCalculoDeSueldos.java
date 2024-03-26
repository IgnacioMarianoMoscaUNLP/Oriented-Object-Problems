package ar.edu.unlp.info.oo2.calculoDeSueldoEjer4OO2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCalculoDeSueldos {

	Pasante pasante;
	Temporario temporario;
	Planta empleadoPlanta;
	@BeforeEach
	void setUp() throws Exception{
		pasante = new Pasante();
		temporario = new Temporario();
		empleadoPlanta = new Planta();
	}
	
	@Test
	public void testCalcularSueldoPasante() {
		pasante.setCantExamenes(2.0);
		Double cantExamenes =2.0;
		Double cobra = 20000.0+2000.0*cantExamenes-(20000.0*0.13+2000.0*2.0*0.05);
		assertEquals(cobra,pasante.calcularSueldo());
	}
	
	@Test
	public void testCalcularSueldoTemporarioConHijos() {
		temporario.setCantHijos(2.0);
		temporario.setCantHoras(0.0);
		temporario.setCasado(false);
		Double cantHijos = 2.0;
		Double cobra = 20000.0+2000.0*cantHijos-(20000.0*0.13+2000.0*cantHijos*0.05);
		assertEquals(cobra,temporario.calcularSueldo());
	}
	
	@Test
	public void testCalcularSueldoTemporarioCantHoras() {
		temporario.setCantHijos(0.0);
		temporario.setCantHoras(2.0);
		temporario.setCasado(false);
		Double cantHoras = 2.0;
		Double basico = 20000.0+300.0*cantHoras;
		Double cobra = basico+0.0-(basico*0.13+0.0*0.05);
		assertEquals(cobra,temporario.calcularSueldo());
	}
	
	@Test
	public void testCalcularSueldoTemporarioCasado() {
		temporario.setCantHijos(0.0);
		temporario.setCantHoras(0.0);
		temporario.setCasado(true);
		Double cobra = 20000.0+5000.0-(20000.0*0.13+5000.0*0.05);
		assertEquals(cobra,temporario.calcularSueldo());
	}
	
	@Test
	public void testCalcularSueldoPlantaConAntiguedad() {
		empleadoPlanta.setCantHijos(0.0);
		empleadoPlanta.setCantHoras(0.0);
		empleadoPlanta.setCasado(false);
		
		empleadoPlanta.setAñoAntiguedad(2.0);
		Double antiguedad = 2.0;
		Double cobra = 50000.0+2000.0*antiguedad-(50000.0*0.13+2000.0*antiguedad*0.05);
		assertEquals(cobra,empleadoPlanta.calcularSueldo());
	}
	
	@Test
	public void testCalcularSueldoPlantaSinAntiguedad() {
		empleadoPlanta.setCantHijos(0.0);
		empleadoPlanta.setCantHoras(0.0);
		empleadoPlanta.setCasado(false);
		
		empleadoPlanta.setAñoAntiguedad(0.0);
		Double cobra = 50000.0-(50000.0*0.13+0.0*0.05);
		assertEquals(cobra,empleadoPlanta.calcularSueldo());
	}
	
}
