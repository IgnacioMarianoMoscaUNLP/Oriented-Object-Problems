package p16;

import java.util.ArrayList;
import java.util.List;

public class HomeWeatherStation implements WeatherData {
    private List<Double> temperaturas = new ArrayList<>();
    
    @Override
    public double getTemperatura() {
        // Simulación de obtener temperatura
        return 86.0; // ejemplo
    }

    @Override
    public double getPresion() {
        // Simulación de obtener presión
        return 1008.0; // ejemplo
    }

    @Override
    public double getRadiacionSolar() {
        // Simulación de obtener radiación solar
        return 200.0; // ejemplo
    }

    @Override
    public List<Double> getTemperaturas() {
        return temperaturas;
    }

    @Override
    public String displayData() {
        return "Temperatura F: " + this.getTemperatura() +
               " Presión atmosf: " + this.getPresion() +
               " Radiación solar: " + this.getRadiacionSolar();
    }

    // Método para agregar temperatura sensada
    public void agregarTemperatura(double temperatura) {
        temperaturas.add(temperatura);
    }
}

