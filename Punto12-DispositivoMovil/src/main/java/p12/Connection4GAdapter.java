package p12;

public class Connection4GAdapter implements Connection {
	 	private Connection4G connection;

	 	public Connection4GAdapter(Connection4G c) {
	 		this.connection = c;
	 	}
	    
	    public String sendData(String data, long crc) {
	        return connection.transmit(data, crc);
	    }

	    
	    public String pict() {
	        return "pict 4G";
	    }
}
