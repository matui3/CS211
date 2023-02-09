package Homework.Chapter12;//Jon Formantes
// CS211 - Winter 2023
// 2/6/2023
// Analyasis on the time complexity of fibonacci versus bigFastFib


public class FibDriver {
    public static void main(String[] args) {
        Fibonacci test = new Fibonacci(47); // constructor overload
        //System.out.println(test.fibForLoop()); // Chapter 2 code not used this week
        long time1 = System.currentTimeMillis();
        System.out.println(test.fibonacci()); // slow version in text
        long time2 = System.currentTimeMillis();
        System.out.println("slow version run time ms: " + (time2 - time1));
        System.out.println();
        // After numerous tests, and analysis of code, and considerable thought:
        // I conclude that fibonacci() is very slow with Big-O complexity of O(2^n)
        // this is because there are TWO recursive calls for EACH part of n. A simple
        // examle of fib(5) creates fib(4) and fib(3) where each of those will also have two calls. Thus leading to 2 ^ n. Run time almost nearly doubles.
        // Run time also nearly doubles with each increment of n inside Fibonacci

        time1 = System.currentTimeMillis();
        //System.out.println(test.bigFib()); // same as above, but use BigInteger
        System.out.println(test.bigFastFib()); // same as above, but MUCH faster
        time2 = System.currentTimeMillis();
        System.out.println("bigFastFib version run time ms: " + (time2 - time1));
        // After numerous tests, and analysis of code, and considerable thought:
        // I conclude that bigFastFib() is much faster compared to the other version fast with Big-O complexity of O(n)
        // This is much faster as for each call for n, there is only a single recursive call. The data is processed in a call stack
        // instead of a loop. fib(5) is processed through fib(4) then 3...2...1... So each number upp to 5 is only processed once rather than twice.
        // Even though run time is essentially 1-2 ms every time, the number of operations it completes is still dependent on the size of the number.
        // The algorithm cannot process any number at constant time as that would be saying that the time it takes for it do f(45) is the same as f(1)
        // despite the calculation of f(45) including f(1)
    }
}