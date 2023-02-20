package Homework.Chapter16;

public class Test {
    public static void main(String[] args) {
        int[] arr = {3, 9, 4, 2, 3, 8, 17, 4, 3, 18};
        LinkedList<Integer> list = new LinkedList<>();
        for (int i : arr) {
            list.add(i);
        }
        System.out.println("BEFORE: " + list);
        list.removeAll(3);
        System.out.println("AFTER: " + list);
    }
}
