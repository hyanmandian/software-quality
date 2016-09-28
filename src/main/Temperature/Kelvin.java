package Temperature;

public class Kelvin {
    
    static final double ABSOLUTE_ZERO = 273.15;
    
    public double toCelsius(double kelvin) {
        return kelvin - ABSOLUTE_ZERO; 
    }
    
}
