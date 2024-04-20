package FS;

import ar.edu.info.unlp.fileSystem.*;
import  org.junit.jupiter.api.Assertions.*;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Date;
public class fileSystemTest {
	private FileSystem fileSystem;
	@BeforeEach
    void setUp() {
        fileSystem = new FileSystem("FileSystemTest");
        Archivo archivo1 = new Archivo("archivo1", 100);
        Archivo archivo2 = new Archivo("archivo2", 200);
        Archivo archivo3 = new Archivo("archivo3", 300);
        Archivo archivo4 = new Archivo("archivo", 400);
        Archivo archivo5 = new Archivo("archivo", 500);
        
        fileSystem.addArchivo(archivo1);
        fileSystem.addArchivo(archivo2);
        fileSystem.addArchivo(archivo3);
        fileSystem.addArchivo(archivo4);
        fileSystem.addArchivo(archivo5);
    }

    @Test
    void listaDeTodosTest() {
        List<File> lista = fileSystem.buscarTodos("archivo");
        assertEquals(2, lista.size());
        System.out.println(fileSystem.listadoDeContenido());
    }

    @Test
    void buscarTest() {
        File resultado = fileSystem.buscar("archivo3");
        assertNotNull(resultado);
        assertEquals("archivo3", resultado.getName());
    }

    @Test
    void archivoMasNuevoTest() {
        Archivo archivoMasNuevo = (Archivo) fileSystem.archivoMasNuevo();
        assertNotNull(archivoMasNuevo);
        assertEquals("archivo5", archivoMasNuevo.getName());
    }

    @Test
    void archivoMasGrandeTest() {
        Archivo archivoMasGrande = (Archivo) fileSystem.archivoMasGrande();
        assertNotNull(archivoMasGrande);
        assertEquals("archivo", archivoMasGrande.getName());
    }

    @Test
    void tamañoOcupadoTest() {
        int tamañoTotal = fileSystem.size();
        assertEquals(1500, tamañoTotal);
    }
}
