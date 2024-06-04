package punto11;

public 
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