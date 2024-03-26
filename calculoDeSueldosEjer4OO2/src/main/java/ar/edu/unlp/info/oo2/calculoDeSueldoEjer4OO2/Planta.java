package ar.edu.unlp.info.oo2.calculoDeSueldoEjer4OO2;

public class Planta extends Temporario{
	private Double añoAntiguedad;

	public Double getBasico() {
		return 50000.0;
	}
	public Double getAdicional() {
		return 2000.0*this.getAñoAntiguedad()+super.getAdicional();
	}
	public Double getAñoAntiguedad() {
		return añoAntiguedad;
	}

	public void setAñoAntiguedad(Double añoAntiguedad) {
		this.añoAntiguedad = añoAntiguedad;
	}
	
}
