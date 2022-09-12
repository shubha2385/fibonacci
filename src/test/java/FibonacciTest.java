import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {
    private Fibonacci fibonacci;

    @Before
    public void setUp() {
        fibonacci = new Fibonacci();
    }

    @Test
    public void calculate_0() {
        int testIndex = 0;
        int expectedResult = 1;

        assertEquals(expectedResult, fibonacci.calculate(testIndex));
    }

    @Test
    public void calculate_nextFibonacci() {
        int testIndex = 9;
        int expectedResult = 55;

        assertEquals(expectedResult, fibonacci.calculate(testIndex));
    }
}