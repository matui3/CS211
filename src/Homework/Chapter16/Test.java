package Homework.Chapter16;

public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> A = new LinkedList<>();
        for(int i=0;i<7;i++) A.add(i);
        LinkedList<Integer> B = new LinkedList<>();
        for(int i=6; i>0;i--) B.add(i);
        LinkedList<Integer> empty = new LinkedList<>();
        LinkedList<Integer> oneI = new LinkedList<>();
        oneI.add(10);



        System.out.println("Testing <Integer>...");
        System.out.println("\nDELETEBACK: ");
        System.out.println("Before: " + A + ", Size: " + A.size());
        A.deleteBack();
        System.out.println("After:  " + A + ", Size: " + A.size());
        System.out.println("After backwards: " + A.backwards());
        System.out.println("\nDELETEBACK: ");
        System.out.println("Before: " + B + ", Size: " + B.size());
        B.deleteBack();
        System.out.println("After:  " + B + ", Size: " + B.size());
        System.out.println("After backwards: " + B.backwards());
        System.out.println("\nDELETEBACK: ");
        System.out.println("Before: " + empty + ", Size: " + empty.size());
        try {
            empty.deleteBack();
        }
        catch(Exception e) {
            System.out.println(e);
        }
        System.out.println("After:  " + empty + ", Size: " + empty.size());
        System.out.println("\nDELETEBACK: ");
        System.out.println("Before: " + oneI + ", Size: " + oneI.size());
        oneI.deleteBack();
        System.out.println("After:  " + oneI + ", Size: " + oneI.size());
        System.out.println("After backwards: " + oneI.backwards());

        oneI.add(10);

        System.out.println("\nSWITCH PAIRS: ");
        System.out.println("Before: " + A + ", Size: " + A.size());
        A.switchPairs();
        System.out.println("After:  " + A + ", Size: " + A.size());
        System.out.println("After backwards: " + A.backwards());
        System.out.println("\nSWITCH PAIRS: ");
        System.out.println("Before: " + B + ", Size: " + B.size());
        B.switchPairs();
        System.out.println("After:  " + B + ", Size: " + B.size());
        System.out.println("After backwards: " + B.backwards());
        System.out.println("\nSWITCH PAIRS: ");
        System.out.println("Before: " + empty + ", Size: " + empty.size());
        empty.switchPairs();
        System.out.println("After:  " + empty + ", Size: " + empty.size());
        System.out.println("\nSWITCH PAIRS: ");
        System.out.println("Before: " + oneI + ", Size: " + oneI.size());
        oneI.switchPairs();
        System.out.println("After:  " + oneI + ", Size: " + oneI.size());
        System.out.println("After backwards: " + oneI.backwards());

        oneI.add(20);

        System.out.println("\nSWITCH PAIRS: ");
        System.out.println("Before: " + oneI + ", Size: " + oneI.size());
        oneI.switchPairs();
        System.out.println("After:  " + oneI + ", Size: " + oneI.size());
        System.out.println("After backwards: " + oneI.backwards());



        System.out.println("\nSTUTTER: ");
        System.out.println("Before: " + A + ", Size: " + A.size());
        A.stutter();
        System.out.println("After:  " + A + ", Size: " + A.size());
        System.out.println("After backwards: " + A.backwards());
        System.out.println("\nSTUTTER: ");
        System.out.println("Before: " + B + ", Size: " + B.size());
        B.stutter();
        System.out.println("After:  " + B + ", Size: " + B.size());
        System.out.println("After backwards: " + B.backwards());
        System.out.println("\nSTUTTER: ");
        System.out.println("Before: " + empty + ", Size: " + empty.size());
        empty.stutter();
        System.out.println("After:  " + empty + ", Size: " + empty.size());
        oneI.remove(0);
        System.out.println("\nSTUTTER: ");
        System.out.println("Before: " + oneI + ", Size: " + oneI.size());
        oneI.stutter();
        System.out.println("After:  " + oneI + ", Size: " + oneI.size());
        System.out.println("After backwards: " + oneI.backwards());

        System.out.println("\nREMOVEALL (5): ");
        System.out.println("Before: " + A + ", Size: " + A.size());
        A.removeAll(5);
        System.out.println("After:  " + A + ", Size: " + A.size());
        System.out.println("\nREMOVEALL (2): ");
        System.out.println("Before: " + B + ", Size: " + B.size());
        B.removeAll(2);
        System.out.println("After:  " + B + ", Size: " + B.size());
        System.out.println("\nREMOVEALL (1000): ");
        System.out.println("Before: " + empty + ", Size: " + empty.size());
        empty.removeAll(1000);
        System.out.println("After:  " + empty + ", Size: " + empty.size());
        System.out.println("\nREMOVEALL (10): ");
        System.out.println("Before: " + oneI + ", Size: " + oneI.size());
        oneI.removeAll(10);
        System.out.println("After:  " + oneI + ", Size: " + oneI.size());
        System.out.println("After backwards: " + oneI.backwards());
        oneI.add(0);
        System.out.println("\nREMOVEALL (0): ");
        System.out.println("Before: " + oneI + ", Size: " + oneI.size());
        oneI.removeAll(0);
        System.out.println("After:  " + oneI + ", Size: " + oneI.size());
        System.out.println("After backwards: " + oneI.backwards());


        LinkedList<String> X = new LinkedList<>();
        String a="a", b="b", c="c", d="d";
        X.add(a); X.add(b); X.add(c); X.add(d);
        LinkedList<String> Y = new LinkedList<>();
        Y.add("charlie"); Y.add("bravo"); Y.add("alpha");
        LinkedList<String> Z = new LinkedList<>();


        System.out.println("\n\n--------------------------------------------------------------------------------"
                + "\nTesting <String>...");
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


        System.out.println("\nREMOVEALL (a): ");
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
    }
}
