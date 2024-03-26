package ar.edu.unlp.info.oo2.calculoDeSueldoEjer4OO2;

public class Pasante extends Empleado{
	private Double cantExamenes;
	
	
	public Double getCantExamenes() {
		return cantExamenes;
	}

	public void setCantExamenes(Double cantExamenes) {
		this.cantExamenes = cantExamenes;
	}

	@Override
	public Double getBasico() { 
		return 20000.0;
	}

	@Override
	public Double getAdicional() {
		return 2000.0*this.getCantExamenes();
	}

}
