package ar.edu.unlp.info.oo2.Topografia.copy;

import java.util.List;

public class Tierra extends Topografia {

	@Override
	public Integer proporcionAgua() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Integer proporcionTierra() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public Boolean igualTierra(Integer p) {
		return (p==1);
	}

	@Override
	public Boolean igualAgua(Integer p) {
		return (p==0);
	}

	@Override
	public List getPartes() {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}
