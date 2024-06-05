package p12;

public class WifiConn implements Connection{
	private String pict;

    @Override
    public String sendData(String data, long crc) {
        return "WiFi Data: " + data + " with CRC: " + crc + " sent.";
    }

    @Override
    public String pict() {
        return "WiFi image data";
    }
}
