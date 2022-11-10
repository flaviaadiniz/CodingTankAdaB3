public class ToFahrenheit {

    public double toFahrenheitTransform(TemperatureUnit type, double temp) {
        if (type == TemperatureUnit.CELSIUS) {
            return (temp * 1.8) + 32;
        } else if(type == TemperatureUnit.KELVIN) {
            return ((temp - 273.15) * 1.8) + 32;
        } else {
            return temp;
        }
    }
}