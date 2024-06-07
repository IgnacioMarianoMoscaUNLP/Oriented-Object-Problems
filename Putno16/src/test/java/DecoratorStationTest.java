import p16.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import p16.*;
public class DecoratorStationTest {
    private HomeWeatherStation homeWeatherStation;

    @BeforeEach
    public void setUp() {
        homeWeatherStation = new HomeWeatherStation();
        homeWeatherStation.agregarTemperatura(86.0); // Fahrenheit
        homeWeatherStation.agregarTemperatura(80.6); // Fahrenheit (equivalente a 27.0 Celsius)
        homeWeatherStation.agregarTemperatura(89.6); // Fahrenheit (equivalente a 32.0 Celsius)
    }

    @Test
    public void testEjemplo1() {
        
        String expected = "Temperatura F: 86.0 Presión atmosf: 1008.0 Radiación solar: 200.0";
        assertEquals(expected, homeWeatherStation.displayData());
    }

    @Test
    public void testEjemplo2() {
        WeatherData weatherData = new DecoratorCelsius(homeWeatherStation);
        String expected = "Temperatura F: 86.0 Presión atmosf: 1008.0 Radiación solar: 200.0\nTemperatura C: 30.0";
        assertEquals(expected, weatherData.displayData());
    }

    @Test
    public void testEjemplo3() {
        WeatherData weatherData = new DecoratorPromedioTemperatura(new DecoratorCelsius(homeWeatherStation));
        String expected = "Temperatura F: 86.0 Presión atmosf: 1008.0 Radiación solar: 200.0\nTemperatura C: 30.0\nPromedio Temperatura F: 85.4"; // Temperatura promedio en Fahrenheit
        assertEquals(expected, weatherData.displayData());
    }

    @Test
    public void testEjemplo4() {
        WeatherData weatherData = new DecoratorPromedioTemperatura(homeWeatherStation);
        String expected = "Temperatura F: 86.0 Presión atmosf: 1008.0 Radiación solar: 200.0\nPromedio Temperatura F: 85.4";
        assertEquals(expected, weatherData.displayData());
    }

    @Test
    public void testEjemplo5() {
        WeatherData weatherData = new DecoratorMaxMinTemp(new DecoratorPromedioTemperatura(new DecoratorCelsius(homeWeatherStation)));
        String expected = "Temperatura F: 86.0 Presión atmosf: 1008.0 Radiación solar: 200.0\nTemperatura C: 30.0\nPromedio Temperatura F: 85.4\nMáx Temperatura F: 89.6 Mín Temperatura F: 80.6";
        assertEquals(expected, weatherData.displayData());
    }

    @Test
    public void testEjemplo6() {
        WeatherData weatherData = new DecoratorMaxMinTemp(new DecoratorCelsius(homeWeatherStation));
        String expected = "Temperatura F: 86.0 Presión atmosf: 1008.0 Radiación solar: 200.0\nTemperatura C: 30.0\nMáx Temperatura F: 89.6 Mín Temperatura F: 80.6";
        assertEquals(expected, weatherData.displayData());
    }

    @Test
    public void testEjemplo7() {
        WeatherData weatherData = new DecoratorPromedioTemperatura(new DecoratorMaxMinTemp(new DecoratorCelsius(homeWeatherStation)));
        String expected = "Temperatura F: 86.0 Presión atmosf: 1008.0 Radiación solar: 200.0\nTemperatura C: 30.0\nMáx Temperatura F: 89.6 Mín Temperatura F: 80.6\nPromedio Temperatura F: 85.4";
        assertEquals(expected, weatherData.displayData());
    }
}
