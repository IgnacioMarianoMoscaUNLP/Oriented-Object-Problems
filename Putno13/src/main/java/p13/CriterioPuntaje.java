package p13;

import java.util.List;
import java.util.stream.Collectors;

public class CriterioPuntaje extends CriterioSugerencia {

	protected  List<Pelicula> sugerirPeliculas(Decodificador decodificador) {
		return decodificador.getGrillaPeliculas().stream().sorted((p1,p2) -> Double.compare(p2.getPuntaje(), p1.getPuntaje())).collect(Collectors.toList());
	}
}
