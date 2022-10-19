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


    @Test
    void testSubtract(){
        assertEquals(5,calcValue.subtract() );
    }

    @Test
    void testMultiply(){
        assertEquals(10, calcValue.multiply());
    }


    @Test
    void testDivide(){
        assertEquals(5,calcValue.divide());
    }

    @Test
    @AfterEach
    void tearDown() {
    }
}