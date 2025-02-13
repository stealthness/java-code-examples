import fibonacci.FibonacciIterative;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciIterativeTest {

    @Test
    void testIllegalInput() {
        assertThrows(IllegalArgumentException.class, () -> FibonacciIterative.fibonacci(-1));
    }

    @Test
    void testFibonacci0() {
        assertEquals(0, FibonacciIterative.fibonacci(0));
    }

    @Test
    void testFibonacci1() {
        assertEquals(1, FibonacciIterative.fibonacci(1));
    }

    @Test
    void testFibonacci2() {
        assertEquals(1, FibonacciIterative.fibonacci(2));
    }

    @Test
    void testFibonacci5() {
        assertEquals(5, FibonacciIterative.fibonacci(5));
    }

    @Test
    void testFibonacci10() {
        assertEquals(55, FibonacciIterative.fibonacci(10));
    }

    @Timeout(1)
    void testFibonnci10InTime() {
        FibonacciIterative.fibonacci(10);
    }

    @Timeout(1)
    void testFibonnci48InTime() {
        FibonacciIterative.fibonacci(48);
    }


}