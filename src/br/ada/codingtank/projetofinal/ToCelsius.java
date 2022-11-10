public class ToCelsius {

    public double toCelsiusTransform(TemperatureUnit type, double temp) {
        if (type == TemperatureUnit.FAHRENHEIT) {
            return (temp - 32) / 1.8;
        } else if(type == TemperatureUnit.KELVIN) {
            return temp - 273.15;
        } else {
            return temp;
        }
    }
}