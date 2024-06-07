package p13;

import java.util.List;
import java.util.stream.Collectors;

public class CriterioSimilaridad extends CriterioSugerencia {

	@Override
	protected   List<Pelicula> sugerirPeliculas(Decodificador decodificador) {
		return decodificador.getPeliculasReproducidas().stream().map(pelicula -> pelicula.getSimilares()).flatMap(lista -> lista.stream()).distinct().collect(Collectors.toList());
	} 
}
