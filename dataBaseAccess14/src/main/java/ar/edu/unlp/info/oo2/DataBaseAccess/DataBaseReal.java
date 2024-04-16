package ar.edu.unlp.info.oo2.DataBaseAccess;
import java.util.List;
import java.util.ArrayList;

public class DataBaseReal implements DataBaseAccess{

	private List<String[]> database;

	public DataBaseReal() {
		this.database = new ArrayList<String[]>();
	}

    @Override
    public int insertNewRow(String[] rowData) {
    	this.database.add(rowData);
        return 0; // Código de inserción simulado
    }

    @Override
    public String[] getSearchResults(String queryString) {
       
        return null; // Resultados de búsqueda simulados
    }
}
