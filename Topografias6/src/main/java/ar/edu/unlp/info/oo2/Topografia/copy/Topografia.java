package ar.edu.unlp.info.oo2.Topografia.copy;
import java.util.List;
public abstract class Topografia {
	public abstract Integer proporcionAgua();
	public abstract Integer proporcionTierra();

	public Boolean igual(Topografia t) {
		return (this.igualAgua(t.proporcionAgua())&& this.igualTierra(t.proporcionTierra()));
	}

	public abstract Boolean igualMixta(Mixta m);
	public abstract Boolean igualTierra(Integer d);
	public abstract Boolean igualAgua(Integer d);
	public abstract List getPartes();
}
