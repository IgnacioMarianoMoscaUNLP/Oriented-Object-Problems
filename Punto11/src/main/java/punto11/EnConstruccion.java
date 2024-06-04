package punto11;

public 
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