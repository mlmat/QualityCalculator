package pl.edu.agh.qualitycalculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CalculationsTest {
    Calculations calculationsUnderTest;

    @Before
    public void setUp() {
        calculationsUnderTest = new Calculations();
    }

    @Test
    public void testSum() throws Exception {
        assertEquals(5, calculationsUnderTest.calculate(Operation.SUM, 2, 3), 0.01);
    }

    @Test
    public void testSubtract() throws Exception{
        assertEquals(13, calculationsUnderTest.calculate(Operation.SUBTRACT, 15, 2), 0.01);
    }

    @Test
    public void testDivide() throws Exception {
        assertEquals(3, calculationsUnderTest.calculate(Operation.DIVIDE, 6, 2), 0.01);
    }

    @Test
    public void testMultiply () throws Exception {
        assertEquals(15, calculationsUnderTest.calculate(Operation.MULTIPLY, 3, 5), 0.01);
    }

    @Test
    public void testNoData () throws Exception {
        assertEquals(15, calculationsUnderTest.calculate(Operation.MULTIPLY, 3, 5), 0.01);
    }

    @After
    public void tearDown() {
    }
}
