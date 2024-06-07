package p13;
import java.util.List;
import java.util.stream.Collectors;

public class CriterioNovedad extends  CriterioSugerencia {

	
	protected  List<Pelicula> sugerirPeliculas(Decodificador decodificador) {
		return decodificador.getGrillaPeliculas().stream().sorted((p2,p1) -> Integer.compare(p1.getAnioEstreno(), p2.getAnioEstreno())).collect(Collectors.toList());
	}
    
    
}
