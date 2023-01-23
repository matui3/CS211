package NotHomework.Chapter12;

public class Exercises {
    public static void main(String[] args) {
        System.out.println(multiplyEvens(4));
        System.out.println(sumTo(2));
        System.out.println(indexOf("abc", "d"));
        System.out.println(dedup("bookkkkkeeper"));

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
            return (1.0/n) + sumTo(n-1);
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
        String str = "";
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                str += s.charAt(i);
                i++;
            }
        }
        return str;
    }
}
