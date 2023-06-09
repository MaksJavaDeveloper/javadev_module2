package javadev_unit_module2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumCalculatorTest {

    private SumCalculator calc;

    @BeforeEach
    public void beforeEach() {
        calc = new SumCalculator();
    }

    @Test
    public void testSum1Input() {
        Assertions.assertEquals(1, calc.sum(1));
    }

    @Test
    public void testSum3Input() {
        Assertions.assertEquals(6, calc.sum(3));
    }

    @Test
    public void testSum0Input() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> calc.sum(0));
    }

}
