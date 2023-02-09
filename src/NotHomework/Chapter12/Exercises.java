package NotHomework.Chapter12;

public class Exercises {
    public static void main(String[] args) {
        System.out.println(digitMatch(1072503891, 62530841));
        System.out.println(dedup("bookkkkkeeper"));
        System.out.println(vowelsToEnd("beautifully"));
        System.out.println(evenDigits(28));

    }

    public static int multiplyEvens(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException();
        } else if (n == 1) {
            return 2;
        } else {
            return 2 * n * multiplyEvens(n - 1);
        }

    }

    public static double sumTo(int n) {
        if (n == 0) {
            return 0.0;
        } else if (n < 0) {
            throw new IllegalArgumentException();
        }
        if (n == 1) {
            return 1;
        } else {
            return (1.0 / n) + sumTo(n - 1);
        }
    }


    public static int indexOf(String s1, String s2) {
        return indexOfHelper(s1, s2, s1.length());
    }

    private static int indexOfHelper(String s1, String s2, int index) {
        if (s1.contains(s2)) {
            if (s1.equals(s2)) {
                return 0;
            } else if (s1.substring(0, s2.length()).equals(s2)) {
                return 0;
            } else {
                return 1 + indexOf(s1.substring(1), s2);
            }
        } else {
            return -1;
        }
    }


    public static String dedup(String s) {
        String result = "";
        if (s.length() == 1) {
            return s;
        } else {
            if (s.charAt(0) != s.charAt(1)) {
                result += s.charAt(0);
            }
            String oneCharLess = "";
            for (int i = 1; i < s.length(); i++) {
                oneCharLess += s.charAt(i);
            }
            return result + dedup(oneCharLess);
        }
    }

    public static void waysToClimb(int n) {
        travel("[", 0, n); // keep track is where x can increase up to n;
    }

    private static void travel(String s, int step, int n) {
        if (n == 0) {
            System.out.print("]");
        } else {
            int x = 0;
        }
    }

    public static void countBinary(int n) {
        travelBinary(0, n);
    }

    private static void travelBinary(int num, int n) {
        if (num == n) {
            System.out.print("");
        } else {
            System.out.println();

        }
    }

    public static void printBinary(int n) {
        if (n < 2) {
            // base case; same as base 10
            System.out.println(n);
        } else {
            // recursive case; break number apart
            printBinary(n / 2);
            printBinary(n % 2);
        }
    }

    public static void writeSequence(int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        } else if (n == 1) {
            System.out.print("1 ");
        } else {
            System.out.print((n + 1) / 2 + " ");
            if (n != 2) {
                writeSequence(n - 2);
            }
            System.out.print((n + 1) / 2 + " ");
        }
    }

    public static void writeSquares(int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        } else if (n == 1) {
            System.out.print("1 ");
        } else if (n % 2 == 0) {
            writeSquares(n - 1);
            System.out.print(", " + n * n);
        } else {
            System.out.print(n * n + ", ");
            writeSquares(n - 1);
        }
    }


    public static int digitMatch(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException();
        } else if (a == 0 || b == 0) {
            return 1;
        } else {
            int result = 0;
            if (a % 10 == b % 10) {
                result++;
            }
            if (a / 10 == 0 || b / 10 == 0) {
                return result;
            }
            return result + digitMatch(a / 10, b / 10);
        }
    }


    public static String vowelsToEnd(String s) {
        String vowels = "";
        String nonVowels = "";
        if (s.length() == 1) {
            return s;
        } else {
            if (s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' || s.charAt(0) == 'o' || s.charAt(0) == 'u') {
                vowels += s.charAt(0);
            } else {
                nonVowels += s.charAt(0);
            }
            return nonVowels + vowelsToEnd(s.substring(1)) + vowels;
        }
    }


    public static int evenDigits(int n) {
        return evenDigitsHelper(n, 0);

    }

    private static int evenDigitsHelper(int n, int stack) {
        if (n == 0) {
            return 0;
        } else {
            int a = n % 10;
            if (a % 2 == 0) {
                stack++;
                return a * (int) Math.pow(10, stack - 1) + evenDigitsHelper(n / 10, stack);
            } else {
                return evenDigitsHelper(n / 10, stack);
            }
        }
    }
}
