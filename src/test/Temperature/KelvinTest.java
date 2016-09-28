package Temperature;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class KelvinTest {
    
    private Kelvin kelvin;

    @Before
    public void setUp() throws Exception {
        this.kelvin = new Kelvin();
    }
    
    @Test
    public void should26Dot85CelsiusWhen300Kelvin() {
        double expected = 26.85;
        double actual = this.kelvin.toCelsius(300);
        
        assertEquals(expected, actual, Double.BYTES);
    }
    
}
