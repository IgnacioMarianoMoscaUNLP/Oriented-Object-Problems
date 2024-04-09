package ar.edu.unlp.info.oo2.Topografia.copy;

import java.util.List;
import java.util.ArrayList;

public class Mixta extends Topografia{
	
	private List<Topografia> partes;
	
	public Mixta(List<Topografia>t) {
		this.partes = new ArrayList<>(t);
	}
 	
	public List getPartes() {
		return this.partes;
	}
	@Override
	public Integer proporcionAgua() {
		return this.partes.stream().mapToInt(parte -> parte.proporcionAgua()).sum()/4;
	}

	@Override
	public Integer proporcionTierra() {
		return 1-this.proporcionAgua();
	}

	@Override
	public Boolean igual(Topografia t) {
			
		return igualMixta(t);
	}

	@Override
	public Boolean igualTierra(Integer p) {
		return this.proporcionTierra() == p;
	}

	@Override
	public Boolean igualAgua(Integer p) {
		return this.proporcionAgua()==p;
	}

	public Boolean igualMixta(Topografia t) {
		if(super.igual(t))
		{	System.out.println("Misma Proporciones");
			return this.partes.equals(t.getPartes());
		}
		return false;
	}

}
