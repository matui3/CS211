package Quizzes;

public class Quiz16 {
    public static void main(String[] arg824) {
        LinkedIntList quiz16 = new LinkedIntList();
        quiz16.add(1);
        quiz16.add(8);
        quiz16.add(7);
        quiz16.add(2);
        quiz16.add(9);
        quiz16.add(18);
        quiz16.add(2 * 43);
        quiz16.add(0);

        LinkedIntList empty = new LinkedIntList();
        LinkedIntList sizeOne = new LinkedIntList();
        LinkedIntList sizeOneOdd = new LinkedIntList();
        LinkedIntList sizeEven = new LinkedIntList();
        LinkedIntList sizeOdd = new LinkedIntList();
        LinkedIntList allOdd = new LinkedIntList();
        LinkedIntList allEven = new LinkedIntList();
        sizeOne.add(2);
        sizeOneOdd.add(3);
        for (int i = 0; i < 10; i++) {
            sizeEven.add(i);
        }
        for (int i = 0; i < 11; i++) {
            sizeOdd.add(i);
        }

        for (int i = 0; i < 5; i++) {
            allOdd.add(2 * i + 1);
        }

        for (int i = 0; i < 5; i++) {
            allEven.add(2*i);
        }

        System.out.println("BEFORE: " + quiz16 + " Size: " + quiz16.size());
        quiz16.removeEvenNumbers();
        System.out.println("AFTER: " + quiz16 + " Size: " + quiz16.size());
        System.out.println();

        System.out.println("BEFORE: " + empty + " Size: " + empty.size());
        empty.removeEvenNumbers();
        System.out.println("AFTER: " + empty + " Size: " + empty.size());
        System.out.println();

        System.out.println("BEFORE: " + sizeOne + " Size: " + sizeOne.size());
        sizeOne.removeEvenNumbers();
        System.out.println("AFTER: " + sizeOne + " Size: " + sizeOne.size());
        System.out.println();

        System.out.println("BEFORE: " + sizeOneOdd + " Size: " + sizeOneOdd.size());
        sizeOneOdd.removeEvenNumbers();
        System.out.println("AFTER: " + sizeOneOdd + " Size: " + sizeOneOdd.size());
        System.out.println();

        System.out.println("BEFORE: " + sizeEven + " Size: " + sizeEven.size());
        sizeEven.removeEvenNumbers();
        System.out.println("AFTER: " + sizeEven + " Size: " + sizeEven.size());
        System.out.println();

        System.out.println("BEFORE: " + sizeOdd + " Size: " + sizeOdd.size());
        sizeOdd.removeEvenNumbers();
        System.out.println("AFTER: " + sizeOdd + " Size: " + sizeOdd.size());
        System.out.println();

        System.out.println("BEFORE: " + allOdd + " Size: " + allOdd.size());
        allOdd.removeEvenNumbers();
        System.out.println("AFTER: " + allOdd + " Size: " + allOdd.size());
        System.out.println();

        System.out.println("BEFORE: " + allEven + " Size: " + allEven.size());
        allEven.removeEvenNumbers();
        System.out.println("AFTER: " + allEven + " Size: " + allEven.size());
        System.out.println();
    } // your solution is in LinkedIntList.java
}
