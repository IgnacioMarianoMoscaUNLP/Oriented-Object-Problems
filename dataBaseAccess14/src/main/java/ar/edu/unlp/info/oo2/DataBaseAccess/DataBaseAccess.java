package ar.edu.unlp.info.oo2.DataBaseAccess;
import java.util.ArrayList;
import java.util.List;
public interface DataBaseAccess {
	 public int insertNewRow(String[] rowData);
	 public String[] getSearchResults(String queryString);
	
}
