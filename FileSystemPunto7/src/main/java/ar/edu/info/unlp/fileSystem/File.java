package ar.edu.info.unlp.fileSystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class File {
    private String name;
    public File(String name) {
    	this.name =name;
    }
    public String getName(){
    	return this.name;
    }
    public abstract int size();
    public abstract File buscar(String name);
    public void escribir(String path) {
    	path = path+"/"+this.getName();	
    };
	public void comparar(String name, List<File> lista) {
		if(name == this.getName()) {
			lista.add(this);
		}
	}
}
