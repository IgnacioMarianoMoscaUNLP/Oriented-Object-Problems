package p13Test;

import p13.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecodificadorTest {

    private Decodificador decodificador;
    private Pelicula thor, capitanAmerica, ironMan, dunkirk, rocky, rambo;

    @BeforeEach
    public void setUp() {
        thor = new Pelicula("Thor", 7.9, 2007);
        capitanAmerica = new Pelicula("Capitan America", 7.8, 2016);
        ironMan = new Pelicula("Iron Man", 7.9, 2010);
        dunkirk = new Pelicula("Dunkirk", 7.9, 2017);
        rocky = new Pelicula("Rocky", 8.1, 1976);
        rambo = new Pelicula("Rambo", 7.8, 1979);

        thor.agregarSimilar(capitanAmerica);
        thor.agregarSimilar(ironMan);
        rocky.agregarSimilar(rambo);

        List<Pelicula> grilla = new ArrayList<>();
        grilla.add(thor);
        grilla.add(capitanAmerica);
        grilla.add(ironMan);
        grilla.add(dunkirk);
        grilla.add(rocky);
        grilla.add(rambo);

        decodificador = new Decodificador(grilla);
        decodificador.agregarPeliculaReproducida(thor);
        decodificador.agregarPeliculaReproducida(rocky);
    }

    @Test
    public void testSugerencias() {
        // Configurar el decodificador para que sugiera por similaridad
        decodificador.setCriterioSugerencia(new CriterioSimilaridad());
        List<Pelicula> sugerenciasSimilaridad = decodificador.sugerirPeliculas();

        // Verificar sugerencias por similaridad
        
        assertEquals("Capitan America", sugerenciasSimilaridad.get(0).getTitulo());
        assertEquals("Iron Man", sugerenciasSimilaridad.get(1).getTitulo());
        assertEquals("Rambo", sugerenciasSimilaridad.get(2).getTitulo());

        // Configurar el decodificador para que sugiera por puntaje
        decodificador.setCriterioSugerencia(new CriterioPuntaje());
        List<Pelicula> sugerenciasPuntaje = decodificador.sugerirPeliculas();

      
        assertEquals("Rocky", sugerenciasPuntaje.get(0).getTitulo());
        assertEquals("Thor", sugerenciasPuntaje.get(1).getTitulo());
        assertEquals("Iron Man", sugerenciasPuntaje.get(2).getTitulo());
    }
}
