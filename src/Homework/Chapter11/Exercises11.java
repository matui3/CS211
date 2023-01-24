import java.util.*;
// Jon Formantes
// 1/23/2023
// CS 211 - Winter 2023
// Exercises11 contains several static methods for Lists, Maps, and Sets
public class Exercises11
{
    public static void main(String[] a) {
        Integer[] arr1 = {1, 4, 7, 9};
        Integer[] arr2 = {2, 4, 5, 6, 7};
        Set<Integer> s1 = new TreeSet<>();
        Set<Integer> s2 = new TreeSet<>();
        Collections.addAll(s1, arr1);
        Collections.addAll(s2, arr2);

        // Build Integer array
        Integer[] arrayI = {7,4,-9,4,15,8,27,7,11,-5,32,-9,-9};
        ArrayList<Integer> testListI = new ArrayList<Integer>();

        // Build an array of Strings
        String[] arrayS = {"Jane","Logan","Whitaker","Alyssa","Stefanie","Jeff","Kim","Sylvia"};
        ArrayList<String> testListS = new ArrayList<String>();

        // Build the Set of Strings:
        Set<String> testSetS = new TreeSet<String>(testListS);
        Collections.addAll(testListS, arrayS);

        // Build the Set of Integers:
        Set<Integer> testSetI = new TreeSet<Integer>(Arrays.asList(arrayI));

        // Build a Map of Strings:
//        Map<String, String> testMapSS = new HashMap<String, String>();
//        Map<String, Integer> testMapSI = new HashMap<String, Integer>();
//        String[] array2 = {"Jane2","Logan2","Whitaker2","Alyssa2","Stefanie2","Jeff2","Kim2","Sylvia2"};
//        for (int i=0; i<arrayS.length; i++) testMapSS.put(arrayS[i], array2[i]);
//        for (int i=0; i<arrayS.length; i++) testMapSI.put(arrayS[i], i);

        // Exercise 11.8
        System.out.println(testSetS);
        //System.out.println("maxLength="+maxLength(testSetS));
        
        // Exercise 11.11
        System.out.println(testSetI);
        System.out.println("symmetricSetDifference="+symmetricSetDifference(testSetI,testSetI));
        System.out.println(symmetricSetDifference(s1, s2));
//
//        // Exercise 11.12
//        System.out.println(testListS);
//        //System.out.println("contains3="+contains3(testListS));
//
//        // Exercise 11.13
//        System.out.println(testMapSS);
//        //System.out.println("isUnique="+isUnique(testMapSS));
//
//        // Exercise 11.14
//        System.out.println(testMapSI);
//        //System.out.println("intersect="+intersect(testMapSI,testMapSI));
//
//        // Exercise 11.15
//        System.out.println(testListI);
//        //System.out.println("maxOccurrences="+maxOccurrences(testListI));
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

}