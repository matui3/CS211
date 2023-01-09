package BJPExercises.Chapter10;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExercises {

    public static void main(String[] args) {
        int[] list1 = new int[] {10, 20, 30};
        int[] list2 = new int[] {4, 5, 6, 7, 8};

        ArrayList<Integer> listA = new ArrayList<>();
        for (int num : list1) {
            listA.add(num);
        }
        ArrayList<Integer> listB = new ArrayList<>();
        for (int num : list2) {
            listB.add(num);
        }

        interLeave(listB, listA);

        System.out.println(listB);

    }

    public static void removeInRange(ArrayList<Integer> list, int val, int start, int end) {
        for (int i = start; i < end; i++) {
            if (list.get(i) == val) {
                list.remove(i);
                end--;
                i--;
            }
        }
    }

    public static void test(int[] test, ArrayList<Integer> list) {
        for (int num : test) {
            list.add(num);
        }
    }

    public static void stutter(ArrayList<String> list, int k) {
        if (k <= 0) {
            list.clear();
        }
        for (int i = 0; i < list.size(); i+=k) {
            String word = list.get(i);
            for (int j = 0; j < k-1; j++) {
                list.add(i, word);
            }
        }
    }

    public static void markLength4(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == 4) {
                list.add(i, "****");
                i++;
            }
        }
    }

    public static void removeShorterStrings(ArrayList<String> list) {
        int length = list.size();
        if (length % 2 != 0) {
            length--;
        }
        for (int i = 0; i < length; i++) {
            String val1 = list.get(i);
            String val2 = list.get(i+1);

            if (val1.length() <= val2.length()) {
                list.remove(i);
            } else {
                list.remove(i+1);
            }
            length--;
        }
    }

    public static void filterRange(ArrayList<Integer> list, int min, int max) {
        int length = list.size();
        for (int i = 0; i < length; i++) {
            if (list.get(i) >= min && list.get(i) <= max) {
                list.remove(i);
                length--;
                i--;

            }
        }
    }

    public static void removeDuplicates(ArrayList<CalendarDate> list) {
        CalendarDate test = new CalendarDate();
        for (int i = 0; i < list.size() - 1; i++) {
            if (test.compare(list.get(i), list.get(i+1)) == 0) {
                list.remove(i);
                i--;
            }
        }
    }

    public static void interLeave(ArrayList<Integer> a1, ArrayList<Integer> a2) {
        int j = 0;
        int length = a1.size();
        for (int i = 0; i < a2.size(); i++) {
            int num = a2.get(i);
            if (i < length) {
                a1.add(j+1, num);
                j+=2;
            } else {
                a1.add(num);
            }

        }
    }

    public static void mirror(ArrayList<String> list) {
        int length = list.size();
        for (int i = length-1; i > -1; i--) {
            list.add(list.get(i));
        }
    }
}
