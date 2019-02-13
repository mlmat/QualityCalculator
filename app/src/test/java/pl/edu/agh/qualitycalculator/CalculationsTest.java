package pl.edu.agh.qualitycalculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CalculationsTest {
    Calculations calculationsUnderTest;
    CalculationsVerbalizer calculationsVUnderTest;
    @Before
    public void setUp() {
        calculationsUnderTest = new Calculations();

        calculationsVUnderTest = new CalculationsVerbalizer();
    }

    @Test
    public void testSum() throws Exception {
        assertEquals(5, calculationsUnderTest.calculate(Operation.SUM, 2, 3, 0), 0.01);
    }

    @Test
    public void testSubtract() throws Exception{
        assertEquals(13, calculationsUnderTest.calculate(Operation.SUBTRACT, 15, 2, 0), 0.01);
    }

    @Test
    public void testDivide() throws Exception {
        assertEquals(3, calculationsUnderTest.calculate(Operation.DIVIDE, 6, 2, 0), 0.01);
    }

    @Test
    public void testMultiply () throws Exception {
        assertEquals(15, calculationsUnderTest.calculate(Operation.MULTIPLY, 3, 5, 0), 0.01);
    }

    @Test
    public void testNoData () throws Exception {
        assertEquals(15, calculationsUnderTest.calculate(Operation.MULTIPLY, 3, 5, 0), 0.01);
    }
    @Test
    public void testAvg () throws Exception {
        assertEquals(10, calculationsUnderTest.calculate(Operation.AVERAGE, 5, 10, 15), 0.01);
    }

    @Test
    public void testSumVerbalize () throws Exception {
        float result = calculationsUnderTest.calculate(Operation.SUM, 1, 1, 0);
        String verbalization = calculationsVUnderTest.verbalize(Operation.SUM, 1, 1, 0, result);

        assertEquals("1.0 plus 1.0 gives value 2.0", verbalization);
    }


    @After
    public void tearDown() {
    }

}
