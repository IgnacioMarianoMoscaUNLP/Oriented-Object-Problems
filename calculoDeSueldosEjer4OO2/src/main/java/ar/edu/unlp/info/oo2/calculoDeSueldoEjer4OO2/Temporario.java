package ar.edu.unlp.info.oo2.calculoDeSueldoEjer4OO2;

public class Temporario extends Empleado{
	private Double cantHijos;
	private Boolean casado;
	private Double cantHoras;
	
	@Override
	public Double getBasico() {
		
		return 20000.0+this.getCantHoras()*300.0;
	}

	@Override
	public Double getAdicional() {
		if(this.getCasado()) {
			return 5000.0+2000.0*this.getCantHijos();
		}
		else {
			return 2000.0*this.getCantHijos();
		}
	}

	public Double getCantHijos() {
		return cantHijos;
	}

	public void setCantHijos(Double cantHijos) {
		this.cantHijos = cantHijos;
	}

	public Boolean getCasado() {
		return casado;
	}

	public void setCasado(Boolean casado) {
		this.casado = casado;
	}

	public Double getCantHoras() {
		return cantHoras;
	}

	public void setCantHoras(Double cantHoras) {
		this.cantHoras = cantHoras;
	}
	
	
}
