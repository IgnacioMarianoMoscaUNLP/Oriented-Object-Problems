package ar.edu.unlp.info.oo2.calculoDeSueldoEjer4OO2;

public abstract class Empleado {
	public Double calcularSueldo() {
		Double basico = this.getBasico();
		Double adicional = this.getAdicional();
		return basico + adicional - this.getDescuento(basico, adicional);
	}
	
	public abstract Double getBasico();
	public abstract Double getAdicional();
	public Double getDescuento(Double basico,Double adicional) {
		return (basico*0.13)+(adicional*0.05);
	}
}
