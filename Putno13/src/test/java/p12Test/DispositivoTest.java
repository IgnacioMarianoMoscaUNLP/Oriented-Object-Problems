package p12Test;
import p12.*;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
public class DispositivoTest {
	private Dispositivo dispositivo;
    private Ringer ringer;
    private Display display;
    private Connection wifi;
    private Connection4G connection4G;
    private Connection adapter4G;
    private CRC crc16;
    private CRC crc32;

    @Before
    public void setUp() {
        ringer = new Ringer();
        display = new Display();
        wifi = new WifiConn();
        connection4G = new Connection4G();
        adapter4G = new Connection4GAdapter(connection4G);
        crc16 = new CRC16_Calculator();
        crc32 = new CRC32_Calculator();
        dispositivo = new Dispositivo(crc16, wifi, ringer, display);
    }

    @Test
    public void testSendWithCRC16() {
        String data = "Hello, World!";
        String result = dispositivo.send(data);
        assertEquals("WiFi Data: Hello, World! with CRC: 37991 sent.", result);
    }

    @Test
    public void testSendWithCRC32() {
        dispositivo.configurarCRC(crc32);
        String data = "Hello, World!";
        String result = dispositivo.send(data);
        assertEquals("WiFi Data: Hello, World! with CRC: 1243066710 sent.", result);  // Ajuste de CRC correcto
    }

    @Test
    public void testConectarCon4G() {
        String result = dispositivo.conectarCon(adapter4G);
        assertEquals("Displaying: 4G symbol data", result);
    }

    @Test
    public void testConectarConWiFi() {
        dispositivo.conectarCon(adapter4G); // Primero cambia a 4G
        String result = dispositivo.conectarCon(wifi); // Cambia de nuevo a WiFi
        assertEquals("Displaying: WiFi image data", result);
    }

    @Test
    public void testConfigurarCRC16() {
        dispositivo.configurarCRC(crc32); // Cambia a CRC32
        dispositivo.configurarCRC(crc16); // Cambia de nuevo a CRC16
        String data = "Hello, World!";
        String result = dispositivo.send(data);
        assertEquals("WiFi Data: Hello, World! with CRC: 37991 sent.", result);  // Ajuste de CRC correcto
    }

    @Test
    public void testConfigurarCRC32() {
        dispositivo.configurarCRC(crc32);
        String data = "Hello, World!";
        String result = dispositivo.send(data);
        assertEquals("WiFi Data: Hello, World! with CRC: 1243066710 sent.", result);  // Ajuste de CRC correcto
    }
}
