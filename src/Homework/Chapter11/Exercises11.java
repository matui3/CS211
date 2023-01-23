package Homework.Chapter11;

import java.util.*;
/**
 * BC CS211
 * Selected Chapter 11 Exercises
 * 
 * W.P. Iverson, July 2019
 */
public class Exercises11
{
    public static void main(String[] a) {
        // Build Integer array
        Integer[] arrayI = {7,4,-9,4,15,8,27,7,11,-5,32,-9,-9};
        ArrayList<Integer> testListI = new ArrayList<Integer>();
        
        // Build an array of Strings
        String[] arrayS = {"Jane","Logan","Whitaker","Alyssa","Stefanie","Jeff","Kim","Sylvia"};
        ArrayList<String> testListS = new ArrayList<String>();
        
        // Build the Set of Strings:
        Set<String> testSetS = new TreeSet<String>(testListS);
        for (String s: arrayS) testListS.add(s);

        // Build the Set of Integers:
        Set<Integer> testSetI = new TreeSet<Integer>();
        for (int i: arrayI) testSetI.add(i);
        
        // Build a Map of Strings:
        Map<String, String> testMapSS = new HashMap<String, String>();
        Map<String, Integer> testMapSI = new HashMap<String, Integer>();
        String[] array2 = {"Jane2","Logan2","Whitaker2","Alyssa2","Stefanie2","Jeff2","Kim2","Sylvia2"};
        for (int i=0; i<arrayS.length; i++) testMapSS.put(arrayS[i], array2[i]);
        for (int i=0; i<arrayS.length; i++) testMapSI.put(arrayS[i], i);
         
        // Exercise 11.8
        System.out.println(testSetS);
        //System.out.println("maxLength="+maxLength(testSetS));       
        
        // Exercise 11.11
        System.out.println(testSetI);
        System.out.println("symmetricSetDifference="+symmetricSetDifference(testSetI,testSetI));
        
        // Exercise 11.12
        System.out.println(testListS);
        //System.out.println("contains3="+contains3(testListS));
        
        // Exercise 11.13
        System.out.println(testMapSS);
        //System.out.println("isUnique="+isUnique(testMapSS));
        
        // Exercise 11.14
        System.out.println(testMapSI);
        //System.out.println("intersect="+intersect(testMapSI,testMapSI));
        
        // Exercise 11.15
        System.out.println(testListI);
        //System.out.println("maxOccurrences="+maxOccurrences(testListI));
    }


    public static Set<Integer> symmetricSetDifference(Set<Integer> s1, Set<Integer> s2) {
        Set<Integer> s3 = new TreeSet<>();
        Iterator<Integer> i1 = s1.iterator();
        while (i1.hasNext()) {
            int val = i1.next();
            if (!s2.contains(val)) {
                s3.add(val);
            }
        }
        return s3;

    }

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