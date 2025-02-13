package fibonacci;

/**
 * FibonacciIterative class contains a method to calculate fibonacci number iteratively
 */
public class FibonacciIterative {
    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Invalid input");
        }
        if (n == 0) {
            return 0;
        }
        if (n <= 2) {
            return 1;
        }
        int fib = 1;
        int prevFib = 1;
        for (int i = 2; i < n; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }
        return fib;
    }

}
