package Homework.Chapter11;

import java.util.*;
// Jon Formantes
// 1/23/2023
// CS 211 - Winter 2023
// Exercises11 contains several static methods for Lists, Maps, and Sets
public class Exercises11 {
    private static int i;

    public static void main(String[] a) {
        String[] arr = {"foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude"};
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {3, 4, 5};
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        Set<String> s = new TreeSet<>();
        for (int i : arr1) {
            l1.add(i);
        }
        for (int i : arr2) {
            l2.add(i);
        }
        for (String i : arr) {
            s.add(i);
        }

        System.out.println(countCommon(l1, l2));
        removeEvenLength(s);
        System.out.println(s);
    }


    // returns a new set of all items from two sets while removing items that belong to both.
    public static Set<Integer> symmetricSetDifference(Set<Integer> s1, Set<Integer> s2) {
        Set<Integer> s3 = new TreeSet<>();
        Iterator<Integer> i1 = s1.iterator();
        Iterator<Integer> i2 = s2.iterator();
        while (i1.hasNext()) {
            int val = i1.next();
            if (!s2.contains(val)) {
                s3.add(val);
            }
        }

        while (i2.hasNext()) {
            int val = i2.next();
            if (!s1.contains(val)) {
                s3.add(val);
            }
        }
        return s3;

    }

    // takes a list of items and returns true if any string occurs at least 3 times.
    public static boolean contains3(List<String> list) {
        Map<String, Integer> map = new TreeMap<>();
        for (String i : list) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                int val = map.get(i);
                val++;
                map.put(i, val);
            }
        }

        for (String i : map.keySet()) {
            if (map.get(i) == 3) {
                return true;
            }
        }
        return false;
    }

    // checks if all key values in a map are unique and no two keys contain the same value
    public static boolean isUnique(Map<String, String> map) {
        Map<String, Integer> values = new TreeMap<>();
        if (map.isEmpty()) {
            return true;
        } else {
            for (String i : map.keySet()) {
                if (!values.containsKey(map.get(i))) {
                    values.put(map.get(i), 1);
                } else {
                    int num = values.get(map.get(i));
                    num++;
                    values.put(map.get(i), num);
                }
            }
        }
        for (String i : values.keySet()) {
            if (values.get(i) >= 2) {
                return false;
            }
        }
        return true;
    }

    // creates an intersection of two maps. aka a new map that only contains items that are exactly the same in both maps
    public static Map<String, Integer> intersect(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> map3 = new TreeMap<>();
        for (String i : map1.keySet()) {
            if (map2.containsKey(i)) {
                if (map1.get(i).equals(map2.get(i))) {
                    map3.put(i, map1.get(i));
                }
            }
        }
        return map3;
    }

    // creates a map that records the number of occurences of items in a list. Returns the number with the greatest number of occurences.
    public static int maxOccurrences(List<Integer> list) {
        Map<Integer, Integer> map = new TreeMap<>();
        if (list.isEmpty()) {
            return 0;
        } else {
            for (Integer i : list) {
                if (!map.containsKey(i)) {
                    map.put(i, 1);
                } else {
                    int val = map.get(i);
                    val++;
                    map.put(i, val);
                }
            }
        }
        int max = 0;
        for (Integer i : map.keySet()) {
            if (map.get(i) > max) {
                max = map.get(i);
            }
        }
        return max;
    }

    public static List<Integer> alternate(List<Integer> l1, List<Integer> l2) {
        if (l1.isEmpty()) {
            return l2;
        } else if (l2.isEmpty()) {
            return l1;
        }
        List<Integer> l3 = new ArrayList<>();
        int i = 0;
        int j = 0;
        if (l1.size() < l2.size()) {
            for (i = 0; i < l1.size(); i++) {
                l3.add(l1.get(i));
                l3.add(l2.get(j));
                j++;
            }
            for (int k = j; k < l2.size(); k++) {
                l3.add(l2.get(k));
            }
        } else {
            for (i = 0; i < l2.size(); i++) {
                l3.add(l1.get(i));
                l3.add(l2.get(j));
                j++;
            }
            for (int k = j; k < l1.size(); k++) {
                l3.add(l2.get(k));
            }
        }
        return l3;
    }


    public static int countCommon(List<Integer> l1, List<Integer> l2) {
        Set<Integer> s2 = new TreeSet<>();
        Set<Integer> s1 = new TreeSet<>();
        Set<Integer> s3 = new TreeSet<>();
        for (Integer i : l1) {
            s3.add(i);
            s1.add(i);
        }
        for (Integer i : l2) {
            s3.add(i);
            s2.add(i);
        }
        Iterator<Integer> i1 = s3.iterator();
        while (i1.hasNext()) {
            int val = i1.next();
            if (s1.contains(val) && !s2.contains(val) || !s1.contains(val) && s2.contains(val)) {
                i1.remove();
            }
        }
        return s3.size();
    }

    public static void removeEvenLength(Set<String> s) {
        Iterator<String> itr = s.iterator();
        while (itr.hasNext()) {
            String word = itr.next();
            if (word.length() % 2 == 0) {
                itr.remove();
            }
        }
    }

    public static Map<String, Integer> reverse(Map<Integer, String> map) {
        Map<String, Integer> dict = new TreeMap<>();
        for (Integer i : map.keySet()) {
            if (!dict.containsKey(map.get(i))) {
                dict.put(map.get(i), i);
            }
        }
        return dict;
    }

}