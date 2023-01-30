package Quizzes;// Jon Formantes
// CS 211
// Winter 2023 - 1/24/2023
// static method that returns the most frequent year in the list;

import java.util.*;

public class Quiz11 {
    public static void main(String[] args239) {
        ArrayList<CalendarDate> list1 = new ArrayList<CalendarDate>(682);
        System.out.println(maxYearOccurrences(list1)); //   0 is returned when list is empty
        list1.add(new CalendarDate(5, 5, 2018));
        list1.add(new CalendarDate(1, 2, 2018));
        list1.add(new CalendarDate(5, 5, 2018));
        list1.add(new CalendarDate(10, 7, 1907));
        list1.add(new CalendarDate(5, 5, 2018));
        list1.add(new CalendarDate(5, 5, 2017));
        list1.add(new CalendarDate(3, 3, 2010));
        list1.add(new CalendarDate(2, 2, 2010));
        list1.add(new CalendarDate(12, 4, 1907));
        list1.add(new CalendarDate(8,8,2018));
        list1.add(new CalendarDate(12, 12, 2018));
        System.out.println(maxYearOccurrences(list1)); //   4 times we have the year 2018
    }

    // creates a map that returns 0 if the list is empty, otherwise iterates through each calendar date, if
    // the map does not contain the year as a key, put in map as a value of 1. Otherwise increment the value if the
    // key is in the map (creates a frequency of occurrences of year). Then iterate through values to find the max.
    public static int maxYearOccurrences(List<CalendarDate> quiz) {
        Map<Integer, Integer> calYearCount = new TreeMap<>();
        if (quiz.isEmpty()) {
            return 0;
        }
        for (CalendarDate i : quiz) {
            if (!calYearCount.containsKey(i.getYear())) {
                calYearCount.put(i.getYear(), 1);
            } else {
                int val = calYearCount.get(i.getYear());
                val++;
                calYearCount.put(i.getYear(), val);
            }
        }

        int max = 0;
        for (Integer i : calYearCount.values()) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }
}