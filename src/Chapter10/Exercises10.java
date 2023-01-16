package Chapter10;

import java.util.*;

public class Exercises10 {
    public static void main(String[] alot587) {

        // Test Cases
        // Case 0
        String[] arr0 = {"one", "two", "three"};
        ArrayList<String> list0 = new ArrayList<>();
        for (String i : arr0) list0.add(i);


        // Case 1
        String[] arrayS = {"four", "score", "and", "seven", "years", "ago"};
        ArrayList<String> testListS = new ArrayList<String>();
        for (String s : arrayS) testListS.add(s);

        // Case 2
        Integer[] arrayI = {3, 8, 92, 4, 2, 17, 9};
        ArrayList<Integer> testListI = new ArrayList<Integer>();
        for (int i : arrayI) testListI.add(i);

        // Case 3
        ArrayList<Integer> list1 = new ArrayList<>();

        // Case 4
        Integer[] arr2 = {1, 2, 3, 4, 5, 6};
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i : arr2) list2.add(i);

        // Case 5
        Integer[] arr3 = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6};
        ArrayList<Integer> list3 = new ArrayList<>();
        for (int i : arr3) list3.add(i);

        // Case 6
        Integer[] arr4 = {5, 10, 15, 20, 25};
        ArrayList<Integer> list4 = new ArrayList<>();
        for (int i : arr4) list4.add(i);

        // Case 7
        Integer[] arr5 = {1, 3, 5, 7};
        ArrayList<Integer> list5 = new ArrayList<>();
        for (int i : arr5) list5.add(i);

        // Use Iversons CalendarDate, so we MUST use compareTo concept
        ArrayList<CalendarDate> testListC = new ArrayList<CalendarDate>();
        testListC.add(new CalendarDate(10, 12, 1314));
        testListC.add(new CalendarDate(10, 12, 1314));
        testListC.add(new CalendarDate(2, 14, 2022));
        testListC.add(new CalendarDate(3, 21, 2022));

    }

    public static void swapPairs(ArrayList<String> list) {
        int length = 0;
        if (list.size() % 2 == 0) {
            length = list.size();
        } else {
            length = list.size() - 1;
        }
        for (int i = 0; i < length; i = i + 2) {
            String temp = list.get(i);
            list.set(i, list.get(i + 1));
            list.set(i + 1, temp);
        }
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

    public static void stutter(ArrayList<String> list, int k) {
        if (k <= 0) {
            list.clear();
        }
        for (int i = 0; i < list.size(); i += k) {
            String word = list.get(i);
            for (int j = 0; j < k - 1; j++) {
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
            String val2 = list.get(i + 1);

            if (val1.length() <= val2.length()) {
                list.remove(i);
            } else {
                list.remove(i + 1);
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
            if (test.compare(list.get(i), list.get(i + 1)) == 0) {
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
                a1.add(j + 1, num);
                j += 2;
            } else {
                a1.add(num);
            }

        }
    }

    public static void mirror(ArrayList<String> list) {
        int length = list.size();
        for (int i = length - 1; i > -1; i--) {
            list.add(list.get(i));
        }
    }
}