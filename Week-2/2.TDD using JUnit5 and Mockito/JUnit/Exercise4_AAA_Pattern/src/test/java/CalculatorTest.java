import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calc;

    @Before
    public void setUp() {
        calc = new Calculator();
        System.out.println("Setup");
    }

    @After
    public void tearDown() {
        System.out.println("Teardown");
    }

    @Test
    public void testAdd() {
        assertEquals(8, calc.add(3, 5));
    }

    @Test
    public void testSubtract() {
        assertEquals(2, calc.subtract(7, 5));
    }
}
