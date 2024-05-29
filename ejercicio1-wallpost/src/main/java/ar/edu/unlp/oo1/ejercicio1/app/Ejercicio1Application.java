package ar.edu.unlp.oo1.ejercicio1.app;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.SwingUtilities;

import ar.edu.unlp.oo1.ejercicio1.ui.WallPostUI;

public class Ejercicio1Application {

	
	
	public static void main(String[] args) throws SecurityException, IOException {
		 FileHandler fileHandler = new FileHandler("logsModelo.txt");
		 Logger.getLogger("app.main").addHandler(new FileHandler("log.txt"));
		 Logger.getLogger("app.main").log(Level.INFO,"app iniciada");
		 Logger.getLogger("modelo").addHandler(fileHandler);
		  Logger.getLogger("interfaz").addHandler( new FileHandler ("logsInterfaz.txt"));
	
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new WallPostUI();
			}
		});
	}

}
