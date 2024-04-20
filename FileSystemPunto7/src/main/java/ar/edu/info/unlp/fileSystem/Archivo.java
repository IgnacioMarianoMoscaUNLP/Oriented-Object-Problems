package ar.edu.info.unlp.fileSystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Archivo extends File {
    private Date creationDate;
    private Integer size;
    
    public Archivo(String name,Integer size) {
    	super(name);
    	this.size = size;
    	this.creationDate = new Date();
    }
    
    public Date getCreationDate() {
		return creationDate;
	}


	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}


	@Override
    public int size() {
        return this.size;
    }

	@Override
	public File buscar(String name) {
		if(name==this.getName()) {
			return this;
		}
		return null;
	}

	
}
