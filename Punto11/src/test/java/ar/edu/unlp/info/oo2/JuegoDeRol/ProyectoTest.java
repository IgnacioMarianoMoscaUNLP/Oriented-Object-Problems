package ar.edu.unlp.info.oo2.JuegoDeRol;
import punto11.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

public class ProyectoTest {
    @Test
    public void testAprobarProyecto() {
        // Crear fechas de inicio y fin
        Date fechaInicio = new Date();
        Date fechaFin = new Date(fechaInicio.getTime() + 1000 * 60 * 60 * 24 * 7); // Una semana después

        // Crear un nuevo proyecto
        Proyecto proyecto = new Proyecto("Vacaciones de invierno", fechaInicio, fechaFin, "salir con amigos", 3, 1000);

        
        assertTrue(proyecto.getEstado() instanceof EnConstruccion);
        proyecto.aprobarProyecto();        
        // Asegurarse de que el proyecto está en evaluación
        assertTrue(proyecto.getEstado() instanceof EnEvaluacion);

        // Aprobar el proyecto
        proyecto.aprobarProyecto();

        // Verificar que el proyecto ha sido aprobado
        assertTrue(proyecto.getEstado() instanceof Confirmada);
    }
}

	
	

