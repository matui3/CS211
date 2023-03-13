package Homework.Chapter18;

public class Driver {
    public static void main(String[] args) {
        HashSet<Integer> hash = new HashSet<>();
        hash.add(1); hash.add(91); hash.add(71); hash.add(5); hash.add(45); hash.add(7); hash.add(9);
        hash.add(55); hash.add(65);
        System.out.println(hash.toString2());
        System.out.println();
        HashSet<CalendarDate> hash2 = new HashSet<>();
        for (int i = 1; i < 16; i+= 2) {
            hash2.add(new CalendarDate(7, i, 17));
        }
        System.out.println(hash2.toString2());
        System.out.println("AFTER ADDING:");
        hash2.add(new CalendarDate(7, 22, 17));
        System.out.println(hash2.toString2());
        System.out.println();
        HashSet<Integer> test = new HashSet<>();
        test.add(81); test.add(91);
        for (int i = 1; i < 80; i +=10) {
            test.add(i);
        }
        System.out.println(test.toString2());
    }
}

