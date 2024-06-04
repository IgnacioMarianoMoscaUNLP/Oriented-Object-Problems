package punto11;

public 

abstract class EstadoProyecto {
    public abstract void aprobar(Proyecto proyecto);

    public void cancelar(Proyecto p) {
    	p.setEstado(new Cancelada());
    	p.setObjetivo("Cancelado");
    }
    
    public void modificarMargenDeGanancia(double margen, Proyecto p) {
        
    }
}