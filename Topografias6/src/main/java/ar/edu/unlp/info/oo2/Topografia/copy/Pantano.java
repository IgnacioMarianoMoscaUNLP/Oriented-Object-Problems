package ar.edu.unlp.info.oo2.Topografia.copy;

import java.util.List;

public class Pantano extends Topografia{

	@Override
	public Integer proporcionAgua() {
		// TODO Auto-generated method stub
		return 7/10;
	}

	@Override
	public Integer proporcionTierra() {
		// TODO Auto-generated method stub
		return 3/10;
	}

	@Override
	public Boolean igualTierra(Integer d) {
		// TODO Auto-generated method stub
		return this.proporcionTierra()==d;
	}

	@Override
	public Boolean igualAgua(Integer d) {
		// TODO Auto-generated method stub
		return this.proporcionAgua()==d;
	}

	@Override
	public List getPartes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean igualMixta(Mixta m) {
		// TODO Auto-generated method stub
		return false;
	}

}
