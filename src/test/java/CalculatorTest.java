import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void checkSum1 () {
        Assert.assertEquals(Calculator.sum1(),5);
    }
    @Test
    public void checkSum2 () {
        Assert.assertEquals(Calculator.sum2(), 1);
    }
    @Test
    public void checkSubtraction1 () {
        Assert.assertEquals(Calculator.subtraction1(), 2.3, Double.MIN_VALUE);
    }
    @Test
    public void checkSubtraction2 () {
        Assert.assertEquals(Calculator.subtraction2(), 9);
    }
    @Test
    public void checkMultiple1 () {
        Assert.assertEquals(Calculator.multiple1(), 8);
    }
    @Test
    public void checkDivide () {
        Assert.assertEquals(Calculator.divide1(), 1.75, Double.MIN_VALUE);
    }
}
