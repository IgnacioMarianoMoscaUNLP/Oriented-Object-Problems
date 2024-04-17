package ar.edu.unlp.info.oo2.DataBaseAccess;

class ProxySecurityDataBaseAccess implements DataBaseAccess {
    private DataBaseAccess databaseAccess;
    private Boolean session;

    public ProxySecurityDataBaseAccess(DataBaseAccess databaseAccess) {
        this.databaseAccess = databaseAccess;
        this.session = false;
    }

    public void log(String password) {
        if(password =="objetosDos") {
        	this.session = true;
        }
        else {
        	throw new RuntimeException("Contraseña de Acceso incorrecta");
        }
    }
    
    public void logOut() {
    	this.session = false;
    }

    private boolean isLogin() {
    	
        return this.session;
    }

    @Override
    public int insertNewRow(String[] rowData) {
        if (isLogin()) {
          
            return databaseAccess.insertNewRow(rowData);
        } else {
        	throw new RuntimeException("NO tiene acceso autorizado, ingrese contraseña de acceso");        
        }
    }

    @Override
    public String[] getSearchResults(int queryString) {
        if (isLogin()) {
            return databaseAccess.getSearchResults(queryString);
        } else {
           
        	throw new RuntimeException("NO tiene acceso autorizado, ingrese contraseña de acceso");
        }
    }
}