public class ToKelvin {

    public double toKelvinTransform(TemperatureUnit type, double temp) {
        if (type == TemperatureUnit.CELSIUS) {
            return temp + 273.15;
        } else if(type == TemperatureUnit.FAHRENHEIT) {
            return ((temp - 32) / 1.8) + 273.15;
        } else {
            return temp;
        }
    }

}