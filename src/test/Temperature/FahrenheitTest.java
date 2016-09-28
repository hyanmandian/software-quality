package Temperature;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class FahrenheitTest {
    
    private Fahrenheit fahrenheit;
    
    @Before
    public void setUp() throws Exception {
        this.fahrenheit = new Fahrenheit();
    }

    @Test
    public void should150CelsiusWhen302Fahrenheit() {
        double expected = 150;
        double actual = this.fahrenheit.toCelsius(302);

        assertEquals(0, Double.compare(expected, actual));
    }

}
