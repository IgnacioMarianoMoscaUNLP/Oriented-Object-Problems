package p12;

public class Dispositivo {
	 private CRC crcCalculator;
	    private Connection connection;
	    private Ringer ringer;
	    private Display display;
	    
	    public Dispositivo(CRC crcCalculator, Connection connection, Ringer ringer, Display display) {
	        this.crcCalculator = crcCalculator;
	        this.connection = connection;
	        this.ringer = ringer;
	        this.display = display;
	    }

	    public String send(String data) {
	        long crc = this.crcCalculator.crcFor(data);
	        return this.connection.sendData(data, crc);
	    }

	    public String conectarCon(Connection nuevaConexion) {
	        this.connection = nuevaConexion;
	        String symbol = this.connection.pict();
	        this.ringer.ring();
	        return this.display.showBanner(symbol);
	    }

	    public void configurarCRC(CRC nuevoCRC) {
	        this.crcCalculator = nuevoCRC;
	    }
}
