package p16;

public class DecoratorMaxMinTemp extends DecoratorStation {

    public DecoratorMaxMinTemp(WeatherData weatherData) {
        super(weatherData);
    }

    public double getMaxTemperatura() {
        return getTemperaturas().stream().mapToDouble(Double::doubleValue).max().orElse(0.0);
    }

    public double getMinTemperatura() {
        return getTemperaturas().stream().mapToDouble(Double::doubleValue).min().orElse(0.0);
    }

    @Override
    public String displayData() {
        return super.displayData() + "\n" +
               "Máx Temperatura F: " + getMaxTemperatura() +
               " Mín Temperatura F: " + getMinTemperatura();
    }
}

