package pl.edu.agh.qualitycalculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CalculationsVerbalizerTest {
    CalculationsVerbalizer calculationsVUnderTest;
    Calculations calculationsUnderTest;

    @Before
    public void setUp() {
        calculationsVUnderTest = new CalculationsVerbalizer();
        calculationsUnderTest = new Calculations();
    }

    @Test
    public void testSumVerbalize () throws Exception {
        float result = calculationsUnderTest.calculate(Operation.SUM, 1, 1);
        String verbalization = calculationsVUnderTest.verbalize(Operation.SUM, 1, 1, result);

        assertEquals("1.0 plus 1.0 gives value 2.0", verbalization);
    }

    @After
    public void tearDown() {
    }
}
