package p12;
import java.util.zip.CRC32;
public class CRC32_Calculator implements CRC {
	
    public long crcFor(String data) {
        CRC32 crc = new CRC32();
        crc.update(data.getBytes());
        return crc.getValue();
    }
}