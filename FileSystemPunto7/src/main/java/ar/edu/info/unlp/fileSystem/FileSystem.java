package ar.edu.info.unlp.fileSystem;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class FileSystem extends File{
	
	private List<File> archivos = new ArrayList<>();
    public FileSystem(String name) {
		super(name);
	}

    @Override
	public int size() {
		if(this.archivos.isEmpty()) {
			return 0;
		}
		else {
			return this.archivos.stream().mapToInt(file-> file.size()).sum();
		}
	}
    
    public File archivoMasGrande() {
        return encontrarArchivoMasGrande(this);
    }

    private File encontrarArchivoMasGrande(File file) {
        if (file instanceof Archivo) {
            return file;
        } else{
            File archivoMasGrande = null;
            int tamañoMasGrande = Integer.MIN_VALUE;
            
            for (File f : this.archivos) {
                File archivo = encontrarArchivoMasGrande(f);
                if (archivo != null && archivo.size() > tamañoMasGrande) {
                    archivoMasGrande = archivo;
                    tamañoMasGrande = archivo.size();
                }
            }
            
            return archivoMasGrande;
        }
    }

    public File archivoMasNuevo() {
        return encontrarArchivoMasNuevo(this);
    }

    private File encontrarArchivoMasNuevo(File file) {
        if (file instanceof Archivo) {
            return file;
        } else {
           File archivoMasNuevo = null;
            Date fechaMasNueva = null;

            for (File f : this.archivos) {
                File archivo = encontrarArchivoMasNuevo(f);
                if (archivo != null) {
                    Date fechaArchivo = ((Archivo) archivo).getCreationDate();
                    if (fechaMasNueva == null || fechaArchivo.after(fechaMasNueva)) {
                        archivoMasNuevo = archivo;
                        fechaMasNueva = fechaArchivo;
                    }
                }
            }

            return archivoMasNuevo;
        }
    }

    public File buscar(String name) {
    	if(name==this.getName()) {
    		return this;
    	}
        return this.archivos.stream().filter(file->file.buscar(name)!= null).findFirst().orElse(null);
    }

    public List<File> buscarTodos(String name) {
        
    	List<File> todosName=new ArrayList();
    	this.archivos.forEach(f-> f.comparar(name,todosName));
    	return todosName;
    }

    public void escribir(String path) {
    		super.escribir(path);
    		this.archivos.forEach(f->f.escribir(path));
    	
    }
    public String listadoDeContenido() {
    	String todo ="/"+this.getName();
    	this.archivos.forEach(f-> f.escribir(todo));
        return todo;
    }
    
    public void addArchivo(File f) {
    	this.archivos.add(f);    }

	@Override
	public void comparar(String name, List<File> lista) {
		super.comparar(name,lista);
		this.archivos.forEach(f->f.comparar(name, lista));
	}


    
}