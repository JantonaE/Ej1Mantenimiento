package org.jae.Fibonacci;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
/*
    fib(0) = 0
    fib(1) = 1
    fib(2) = 1
    fib(3) = 2
    fib(4) = 3
    fib(5) = 5
    fib(6) = 8
    fib(n) = fi(n-1) + fib(n-2)
    fib(negativo) = error
 */
class FibonacciTest {
    private Fibonacci fibonacci;

    @BeforeEach
    private void setup(){
        fibonacci = new Fibonacci();
    }

    @Test
    public void shouldFibOfZeroReturnZero() {
        int obtainedValue = fibonacci.fib(0);
        int expectedValue = 0;
        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void shouldFibOfOneReturnOne() {
        int obtainedValue = fibonacci.fib(1);
        int expectedValue = 1;
        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void shouldFibOfTwoReturnOne() {
        int obtainedValue = fibonacci.fib(2);
        int expectedValue = 1;
        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void shouldFibOfThreeReturnTwo() {
        int obtainedValue = fibonacci.fib(3);
        int expectedValue = 2;
        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void shouldFibOfFourReturnThree() {
        int obtainedValue = fibonacci.fib(4);
        int expectedValue = 3;
        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void shouldFibOfFiveReturnFive() {
        int obtainedValue = fibonacci.fib(5);
        int expectedValue = 5;
        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void shouldFibOfSixReturnEight() {
        int obtainedValue = fibonacci.fib(6);
        int expectedValue = 8;
        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void shouldFibOfNegativeReturnException() {
        assertThrows(RuntimeException.class,() ->fibonacci.fib(-1));

    }


}