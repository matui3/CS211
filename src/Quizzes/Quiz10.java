package Quizzes;

import java.util.ArrayList;

// Jon Formantes
// CS 211
// Winter 2023 - 1/17/2023
// Static method of removing odd months from an arraylist.

public class Quiz10 {
    public static void main(String[] a833) {
        ArrayList<CalendarDate> dates = new ArrayList<CalendarDate>(929);
        ArrayList<CalendarDate> list1 = new ArrayList<>(20);
        dates.add(new CalendarDate(5, 5, 2018));
//        dates.add(new CalendarDate(5, 5, 2018));
//        dates.add(new CalendarDate(10, 5, 2018));
//        dates.add(new CalendarDate(5, 7, 2017));
//        dates.add(new CalendarDate(10, 5, 2020));
//        dates.add(new CalendarDate(1, 21, 2020));
//        dates.add(new CalendarDate(2, 2, 1998));
//        dates.add(new CalendarDate(3, 3, 1800));
        ArrayList<CalendarDate> list = new ArrayList<>();
        System.out.println("Before: " + dates); // 4 items in list
        removeOddMonths(dates);
        System.out.println(" After: " + dates); // now fewer items
    }

    // removes all odd-numbered months in a given arraylist
    public static void removeOddMonths(ArrayList<CalendarDate> list) {
        int length = list.size();
        for (int i = 0; i < length; i++) {
            if (list.get(i).getMonth() % 2 == 1) {
                list.remove(i);
                length--;
                i--;
            }
        }
    }
}
