package ar.edu.unlp.info.oo2.DataBaseAccess;
import java.util.logging.Logger;
import java.util.logging.Level;

public class ProxySecurityDataBaseAccess implements DataBaseAccess {
    private DataBaseAccess databaseAccess;
    private Boolean session;
    private  Logger logger;

    public ProxySecurityDataBaseAccess(DataBaseAccess databaseAccess) {
        
    	logger  = Logger.getLogger("proxy.main");
        this.databaseAccess = databaseAccess;
        this.session = false;
    }

    public boolean log(String password) {
        if(password =="objetosDos") {
        	this.session = true;
        	return true;
        }
        else {
        	return false;
        }
    }
    
    public void logOut() {
    	this.session = false;
    }

    private boolean isLogin() {
    	if(session==false) {
    		Logger.getLogger("proxy.main").log(Level.SEVERE,"Intento de acceso no autorizado");
    	}
        return this.session;
    }

    @Override
    public int insertNewRow(String[] rowData) {
        if (isLogin()) {
        	logger.log(Level.WARNING,"Se incertó a la BD");
            return databaseAccess.insertNewRow(rowData);
        } else {
        	return -1;       
        }
    }

    @Override
    public String[] getSearchResults(int queryString) {
        if (isLogin()) {
        	logger.log(Level.INFO,"Se buscaron resultados");
        	return databaseAccess.getSearchResults(queryString);            
        } else {
           
        	return null;
        }
    }
}
