package Temperature;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class CelsiusTest {
    
    private Celsius celsius;

    @Before
    public void setUp() throws Exception {
        this.celsius = new Celsius();
    }
    
    @Test
    public void should572FahrenheitWhen300Celsius() {
        double expected = 572;
        double actual = this.celsius.toFahrenheit(300);
        
        assertEquals(0, Double.compare(expected, actual));
    }
    
}
