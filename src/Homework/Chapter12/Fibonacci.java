package Homework.Chapter12;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

// Jon Formantes
// CS 211  1/30/2023
// Calculates Fibonaaci number butin an imroved method. Removes doulbe recursive calls.
public class Fibonacci {
	
	// fields, ONE is in any version of Java already
	// but BigInteger.TWO requires Java 9 or higher, so I make one here
	private static final BigInteger TWO = new BigInteger("2");
	private static final BigInteger ONE = new BigInteger("1");
	private int n; // the boring old 32-bit limited int

	private int sum;
	
	// only one constructor needed
	public Fibonacci(int number) {
		n = number;
	}
	
	// make this private as right now I cannot think of why we need to allow
	@SuppressWarnings("unused")
	private Fibonacci() {
		this(1);
	}
	
	// Chapter 12, Exercise 2, code from page 128-9.
	public int fibForLoop() {
		int n1 = 1;
		int n2 = 1;
		for (int i = 3; i <= n; i++) {
			int n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}
		return n2;
	}	
	
	// Chapter 12, same exercise
	// public accessor into recursive helper
	public int fibonacci() {

		return fibonacciHelper(0, 1, 0, n);
	}

	// private recursive helper given in text
	// Chapter 12, page 830 (5th ed.)
    private int fibonacciHelper(int prev, int curr, int i, int n) {
		i++;
		if (i < n) {
			return fibonacciHelper(curr, curr + prev, i, n);
		} else {
			return curr;
		}

	}

    // Exactly the same concept as above, but using BigInteger
    // This allows us to go up to any size integer
	public BigInteger bigFib() {
		return bigFib(new BigInteger(Integer.toString(n)));
	}
	
	// recursive helper
    private BigInteger bigFib(BigInteger n) {
        if (n.compareTo(TWO)<=0) {
            return ONE;
        } else {
            return bigFib(n.subtract(ONE)).add(bigFib(n.subtract(TWO)));
        }
    }

	// Calculates Fibonaaci number butin an imroved method. Removes doulbe recursive calls.Uses BigInteger
	public BigInteger bigFastFib() {
		// need some help here:
		return fibonacciBig(BigInteger.ZERO, ONE, BigInteger.ZERO, new BigInteger(Integer.toString(n)));
	}

	// heler method for bigFastFib, recursively calculates/uses same alogirthm as small int
	private BigInteger fibonacciBig(BigInteger prev, BigInteger curr, BigInteger i, BigInteger x) {
		i = i.add(ONE);
		if (i.compareTo(BigInteger.valueOf(n)) < 0) {
			return fibonacciBig(curr, curr.add(prev), i, new BigInteger(Integer.toString(n)));
		} else {
			return curr;
		}
	}
    
    
    
	

	


}
