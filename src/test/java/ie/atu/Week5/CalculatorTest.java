package ie.atu.Week5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calcValue;

    @BeforeEach
    void setUp() {
        calcValue = new Calculator();
    }

    @Test
    void testAdd(){
        assertEquals(6, calcValue.add());
    }

    @AfterEach
    void tearDown() {
    }
}