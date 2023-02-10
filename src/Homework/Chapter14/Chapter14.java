package Homework.Chapter14;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class Chapter14 {
    public static void main(String[] args) {
        CalendarDate[] store = {new CalendarDate(1,2,10), new CalendarDate(1,1,10), new CalendarDate(12,30,10)};
        Stack<CalendarDate> testAll = new Stack<CalendarDate>();
        for (CalendarDate i: store) testAll.push(i); // build a Stack
        System.out.println(Chapter14.stutter(testAll)); // 6 dates
        System.out.println(Chapter14.equals(testAll,testAll)); // true
//		System.out.println(Chapter14.isSorted(testAll)); // false
//		for (int i=1;i<=9;i++) testAll.push(new CalendarDate(1,1,10));
//		Chapter14.removeMin(testAll);
//		while (!testAll.empty())
//			System.out.println(testAll.pop().longDate()); // only 2 remain


    }

    public static Stack<CalendarDate> stutter(Stack<CalendarDate> s) {
        Stack<CalendarDate> stack = new Stack<>();
        Queue<CalendarDate> q = new LinkedList<>();
        while (!s.empty()) {
            CalendarDate top = s.pop();
            q.add(top);
        }

        while (!q.isEmpty())     {
            CalendarDate front = q.remove();
            s.push(front);
        }

        while (!s.empty()) {
            CalendarDate top = s.pop();
            q.add(top);
            stack.push(top);
            stack.push(top);
        }

        while (!q.isEmpty()) {
            CalendarDate front = q.remove();
            s.push(front);
        }

        return stack;
    }

    public static boolean equals(Stack<CalendarDate> s1, Stack<CalendarDate> s2) {
        Stack<CalendarDate> s3 = new Stack<>();
        boolean flag = true;

        if (s1.size() != s2.size()) {
            return false;
        }

        while (!s1.empty() && !s2.empty()) {
            CalendarDate one = s1.pop();
            s1.push(one);
            s3.push(one);
            CalendarDate two = s2.pop();
            s2.push(two);
            s3.push(two);
            s1.pop();
            s2.pop();
        }
        while (!s3.empty()) {
            CalendarDate first = s3.pop();
            CalendarDate second = s3.pop();
            s2.push(first);
            s1.push(second);
            if (first.compareTo(second) != 0) {
                flag = false;
            }
        }
        return flag;
    }

    public static boolean isSorted(Stack<CalendarDate> s) {

        Queue<CalendarDate> q = new LinkedList<>();
        boolean flag = true;
        while (s.size() >= 2) {
            CalendarDate first = s.pop();
            CalendarDate second = s.pop();
            q.add(first);
            s.push(second);

            if (second.compareTo(first) < 0) {
                flag = false;
            }
        }
        while (!s.empty()) {
            CalendarDate last = s.pop();
            q.add(last);
        }
        while (!q.isEmpty()) {
            CalendarDate val = q.remove();
            s.push(val);
        }

        while (!s.empty()) {
            CalendarDate num = s.pop();
            q.add(num);
        }
        while (!q.isEmpty()) {
            CalendarDate front = q.remove();
            s.push(front);
        }
        return flag;
    }

    public static CalendarDate removeMin(Stack<CalendarDate> s) {
        Queue<CalendarDate> q = new LinkedList<>();
        CalendarDate min = s.pop();
        s.push(min);
        while (!s.empty()) {
            CalendarDate first = s.pop();
            q.add(first);
            if (first.compareTo(min) < 0) {
                min = first;
            }
        }

        while (!q.isEmpty()) {
            CalendarDate val = q.remove();
            if (val.compareTo(min) != 0) {
                s.push(val);
            }
        }

        while (!s.empty()) {
            CalendarDate top = s.pop();
            q.add(top);
        }

        while (!q.isEmpty()) {
            CalendarDate first = q.remove();
            s.push(first);
        }
        return min;
    }

}
