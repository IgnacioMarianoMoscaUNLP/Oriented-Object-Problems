package p16;

public class DecoratorCelsius extends DecoratorStation {

    public DecoratorCelsius(WeatherData weatherData) {
        super(weatherData);
    }

    public double getTemperaturaCelsius() {
        return (getTemperatura() - 32) * 5 / 9;
    }

    @Override
    public String displayData() {
        return super.displayData() + "\n" +
               "Temperatura C: " + getTemperaturaCelsius();
    }
}
