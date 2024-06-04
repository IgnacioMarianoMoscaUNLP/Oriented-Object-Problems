package punto11;

import java.util.Date;

public class Proyecto {
    private Date fechaInicio;
    private Date fechaFin;
    private String objetivo;
    private int numeroIntegrantes;
    private double montoPorDia;
    private double margenGanancia;
    private EstadoProyecto estado;

    public Proyecto(String Nombre,Date Inicio,Date Fin, String objetivo,int cant, int monto) {
        this.estado = new EnConstruccion();
        this.fechaInicio = Inicio;
        this.fechaFin =Fin;
    
        this.objetivo = objetivo;
        this.numeroIntegrantes = cant;
        this.montoPorDia = monto;
        this.margenGanancia = 7/100;
    }

    
    public int getNumeroIntegrantes() {
		return numeroIntegrantes;
	}


	public void setNumeroIntegrantes(int numeroIntegrantes) {
		this.numeroIntegrantes = numeroIntegrantes;
	}


	public double getMontoPorDia() {
		return montoPorDia;
	}


	public void setMontoPorDia(double montoPorDia) {
		this.montoPorDia = montoPorDia;
	}


	public double getMargenGanancia() {
		return margenGanancia;
	}


	public void setMargenGanancia(double margenGanancia) {
		this.margenGanancia = margenGanancia;
	}


	public void aprobarProyecto() {
        estado.aprobar(this);
    }

    public double costoDeProyecto() {
        return numeroIntegrantes * montoPorDia * (fechaFin.getTime() - fechaInicio.getTime()) / (1000 * 60 * 60 * 24);
    }

    public double precioDeProyecto() {
        return costoDeProyecto() * (1 + margenGanancia);
    }

    public void cancelar() {
        estado.cancelar(this);
    }

    public void modificarMargenDeGanancia(double margen) {
        estado.modificarMargenDeGanancia(margen,this);
    }

    public void setEstado(EstadoProyecto estado) {
        this.estado = estado;
    }

    public void setObjetivo(String objetivo) {
    	this.objetivo = objetivo;
    }


	public Confirmada getEstado() {
		// TODO Auto-generated method stub
		return null;
	}
    
    // Getters y setters para los atributos
}