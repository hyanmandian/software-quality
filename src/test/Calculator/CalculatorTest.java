package Calculator;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        this.calculator = new Calculator();
    }

    @Test
    public void should4WhenSum2Plus2() {
        Integer expected = 4;
        Integer actual = this.calculator.sum(2, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void should6WhenSum2Times3() {
        Integer expected = 6;
        Integer actual = this.calculator.multiply(2, 3);
        assertEquals(expected, actual);
    }
    
    @Test
    public void should3When6Divide3() {
        Integer expected = 3;
        Integer actual = this.calculator.divide(6, 2);
        assertEquals(expected, actual);
    }
    
    @Test
    public void should8When16Subtract8() {
        Integer expected = 8;
        Integer actual = this.calculator.subtract(16, 8);
        assertEquals(expected, actual);
    }
    
    @Test
    public void should3WhenSquare9() {
        Integer expected = 3;
        Integer actual = this.calculator.square(9);
        assertEquals(expected, actual);
    }
    
    @Test
    public void should4WhenPow2() {
        Integer expected = 4;
        Integer actual = this.calculator.pow(2);
        assertEquals(expected, actual);
    }
    
}
