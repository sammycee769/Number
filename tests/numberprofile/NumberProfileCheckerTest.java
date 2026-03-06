package numberprofile;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberProfileCheckerTest {

    @Test
    void testIsPrimeWithWholeNumber() {
         String result= NumberProfileChecker.isPrime(7);
        assertEquals("7 is prime",result);

    }
    @Test
    void testIsPrimeWithDecimalNumber() {
        String result= NumberProfileChecker.isPrime(7.9);
        assertNull(result);
    }
    @Test
    void testIsNaturalNumber() {
        String result= NumberProfileChecker.isNaturalNumber(9);
        assertEquals("9 is a natural number",result);
    }
    @Test
    void testIsNaturalNumberWithDecimalNumber() {
        String result= NumberProfileChecker.isNaturalNumber(9.8);
        assertNull(result);
    }
    @Test
    void testIsInteger() {
        String result= NumberProfileChecker.isInteger(7);
        assertEquals("7 is an integer",result);
    }
    @Test
    void testIsIntegerWithDecimalNumber() {
        String result= NumberProfileChecker.isInteger(7.9);
        assertNull(result);
    }
    @Test
    void testIsIntegerWithNNegativelNumber() {
        String result= NumberProfileChecker.isInteger(-7);
        assertEquals("-7 is an integer",result);
    }
    @Test
    void testIsWholeNumber(){
        String result= NumberProfileChecker.isWholeNumber(7);
        assertEquals("7 is a whole number",result);
    }
    @Test
    void testIsWholeNumberWithDecimalNumber(){
        String result= NumberProfileChecker.isWholeNumber(7.9);
        assertNull(result);
    }
}