package Homework.Chapter16;

public class Test {
    public static void main(String[] args) {
        LinkedList<String> X = new LinkedList<>();
        String a="a", b="b", c="c", d="d";
        X.add(a); X.add(b); X.add(c); X.add(d);
        LinkedList<String> Y = new LinkedList<>();
        Y.add("charlie"); Y.add("bravo"); Y.add("alpha");
        LinkedList<String> Z = new LinkedList<>();
        LinkedList<String> W = new LinkedList<>();
        W.add(a);


        System.out.println("\n\n--------------------------------------------------------------------------------"
                + "\nTesting <String>...");
        System.out.println("\nDELETEBACK: ");
        System.out.println("Before: " + X + ", Size: " + X.size());
        X.deleteBack();
        System.out.println("After:  " + X + ", Size: " + X.size());
        System.out.println("After backwards: " + 	X.backwards());
        System.out.println("\nDELETEBACK: ");
        System.out.println("Before: " + X + ", Size: " + X.size());
        X.deleteBack();
        System.out.println("After:  " + X + ", Size: " + X.size());
        System.out.println("After backwards: " + 	X.backwards());
        System.out.println("\nDELETEBACK: ");
        System.out.println("Before: " + Y + ", Size: " + Y.size());
        Y.deleteBack();
        System.out.println("After:  " + Y + ", Size: " + Y.size());
        System.out.println("After backwards: " + Y.backwards());
        System.out.println("\nDELETEBACK: ");
        System.out.println("Before: " + Z + ", Size: " + Z.size());
        try {
            Z.deleteBack();
        }
        catch(Exception e) {
            System.out.println(e);
        }
        System.out.println("After:  " + Z + ", Size: " + Z.size());
        System.out.println("\nDELETEBACK: ");
        System.out.println("Before: " + W + ", Size: " + W.size());
        W.deleteBack();
        System.out.println("After:  " + W + ", Size: " + W.size());
        System.out.println("After backwards: " + 	W.backwards());


        System.out.println("\nSWITCH PAIRS: ");
        System.out.println("Before: " + X + ", Size: " + X.size());
        X.switchPairs();
        System.out.println("After:  " + X + ", Size: " + X.size());
        System.out.println("After backwards: " + X.backwards());
        System.out.println("\nSWITCH PAIRS: ");
        System.out.println("Before: " + Y + ", Size: " + Y.size());
        Y.switchPairs();
        System.out.println("After:  " + Y + ", Size: " + Y.size());
        System.out.println("After backwards: " + Y.backwards());
        System.out.println("\nSWITCH PAIRS: ");
        System.out.println("Before: " + Z + ", Size: " + Z.size());
        Z.switchPairs();
        System.out.println("After:  " + Z + ", Size: " + Z.size());
        W.add(a);
        System.out.println("\nSWITCH PAIRS: ");
        System.out.println("Before: " + W + ", Size: " + W.size());
        W.switchPairs();
        System.out.println("After:  " + W + ", Size: " + W.size());


        System.out.println("\nSTUTTER: ");
        System.out.println("Before: " + X + ", Size: " + X.size());
        X.stutter();
        System.out.println("After:  " + X + ", Size: " + X.size());
        System.out.println("After backwards: " + X.backwards());
        System.out.println("\nSTUTTER: ");
        System.out.println("Before: " + Y + ", Size: " + Y.size());
        Y.stutter();
        System.out.println("After:  " +Y + ", Size: " + Y.size());
        System.out.println("After backwards: " + Y.backwards());
        System.out.println("\nSTUTTER: ");
        System.out.println("Before: " +Z + ", Size: " + Z.size());
        Z.stutter();
        System.out.println("After:  " + Z + ", Size: " +Z.size());
        System.out.println("\nSTUTTER: ");
        System.out.println("Before: " + W + ", Size: " + W.size());
        W.stutter();
        System.out.println("After:  " + W + ", Size: " + W.size());


        System.out.println("\nREMOVEALL (a): ");
        X.add(b);
        System.out.println("Before: " + X + ", Size: " + X.size());
        X.removeAll("a");
        System.out.println("After:  " + X + ", Size: " + X.size());
        System.out.println("After backwards: " + X);
        System.out.println("\nREMOVEALL (Charlie): ");
        System.out.println("Before: " + Y + ", Size: " + Y.size());
        Y.removeAll("Charlie");
        System.out.println("After:  " + Y + ", Size: " + Y.size());
        System.out.println("After backwards: " + Y);

        System.out.println("\nREMOVEALL (mario): ");
        System.out.println("Before: " + Z + ", Size: " + Z.size());
        Z.removeAll("Mario");
        System.out.println("After:  " + Z + ", Size: " + Z.size());
        W.clear();
        W.add(a);
        System.out.println("\nREMOVEALL (a): ");
        System.out.println("Before: " + W + ", Size: " + W.size());
        W.removeAll("a");
        System.out.println("After:  " + W + ", Size: " + W.size());
    }
}
