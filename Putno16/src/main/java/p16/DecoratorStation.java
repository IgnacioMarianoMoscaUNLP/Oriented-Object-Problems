package p16;
import java.util.ArrayList;
import java.util.List;
public abstract class DecoratorStation implements WeatherData {
    protected WeatherData weatherData;

    public DecoratorStation(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    @Override
    public double getTemperatura() {
        return weatherData.getTemperatura();
    }

    @Override
    public double getPresion() {
        return weatherData.getPresion();
    }

    @Override
    public double getRadiacionSolar() {
        return weatherData.getRadiacionSolar();
    }

    @Override
    public List<Double> getTemperaturas() {
        return weatherData.getTemperaturas();
    }

    @Override
    public String displayData() {
        return weatherData.displayData();
    }
}
