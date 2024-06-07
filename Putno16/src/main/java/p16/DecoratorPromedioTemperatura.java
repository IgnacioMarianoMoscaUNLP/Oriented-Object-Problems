package p16;
import java.util.ArrayList;
import java.util.List;

public class DecoratorPromedioTemperatura extends DecoratorStation {

    public DecoratorPromedioTemperatura(WeatherData weatherData) {
        super(weatherData);
    }

    public double getPromedioTemperaturas() {
        List<Double> temperaturas = getTemperaturas();
        return temperaturas.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
    }

    @Override
    public String displayData() {
        return super.displayData() + "\n" +
               "Promedio Temperatura F: " + getPromedioTemperaturas();
    }
}
