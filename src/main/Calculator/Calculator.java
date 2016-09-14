package Calculator;

public class Calculator {
    
    public Integer sum(Integer a, Integer b) {
        return a + b;
    }
    
    public Integer multiply(Integer a, Integer b) {
        return a * b;
    }
 
    public Integer divide(Integer a, Integer b) {
        return a / b;
    }
    
    public Integer subtract(Integer a, Integer b) {
        return a - b;
    }
    
    public Integer square(int a) {
        return (int) Math.sqrt((double) a);
    }
    
    public Integer pow(Integer a) {
        return (int) Math.pow(a, a);
    }
    
}
