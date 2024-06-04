package punto11;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Empresa {
    private List<Proyecto> proyectos;

    public Empresa() {
        this.proyectos = new ArrayList<>();
    }

    public void gestionarProyectos() {
        // Lógica para gestionar proyectos
    }
}

class Proyecto {
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
    
    // Getters y setters para los atributos
}

abstract class EstadoProyecto {
    public abstract void aprobar(Proyecto proyecto);

    public void cancelar(Proyecto p) {
    	p.setEstado(new Cancelada());
    	p.setObjetivo("Cancelado");
    }
    
    public void modificarMargenDeGanancia(double margen, Proyecto p) {
        
    }
}

class EnConstruccion extends EstadoProyecto {
    @Override
    public void aprobar(Proyecto proyecto) {
    	if(proyecto.precioDeProyecto()>0) {
        proyecto.setEstado(new EnEvaluacion());
    	}else {
    		throw new RuntimeException("El proyecto riene precio 0");
    	}
    }

    @Override
    public void modificarMargenDeGanancia(double margen,Proyecto p) {
    	double m = p.getMargenGanancia();
    	if((m>=0.08)&&(m<=0.10)) {
    		p.setMargenGanancia(margen);
    	}
    }
}

class EnEvaluacion extends EstadoProyecto {
    @Override
    public void aprobar(Proyecto proyecto) {
        proyecto.setEstado(new Confirmada());
    }
    @Override
    public void modificarMargenDeGanancia(double margen,Proyecto p) {
    	double m = p.getMargenGanancia();
    	if((m>=0.08)&&(m<=0.10)) {
    		p.setMargenGanancia(margen);
    	}
    }
    
}

class Confirmada extends EstadoProyecto {
    @Override
    public void aprobar(Proyecto proyecto) {
        
    }

    
}

class Cancelada extends EstadoProyecto {
    @Override
    public void cancelar(Proyecto p) {
        // Lógica para cancelar el proyecto
    }
    
    @Override
    public void aprobar(Proyecto proyecto) {
    	
    }
 
}
