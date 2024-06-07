package p16;

import java.util.List;

public interface WeatherData {

    // Retorna la temperatura en grados Fahrenheit.
    double getTemperatura();

    // Retorna la presión atmosférica en hPa.
    double getPresion();

    // Retorna la radiación solar.
    double getRadiacionSolar();

    // Retorna una lista con todas las temperaturas sensadas hasta el momento, en grados Fahrenheit.
    List<Double> getTemperaturas();

    // Retorna un reporte de todos los datos: temperatura, presión, y radiación solar.
    String displayData();
}
