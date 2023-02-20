package Homework.Chapter16;

public class Test {
    public static void main(String[] args) {
        int[] arr = {3, 7, 4, 9, 8, 12, 2};
        LinkedList<Integer> list = new LinkedList<>();
        for (int i : arr) {
            list.add(i);
        }
        System.out.println("BEFORE SWITCHPAIRS: " + list);
        list.switchPairs();
        System.out.println("AFTER SWITCHPAIRS: " + list);
    }
}
