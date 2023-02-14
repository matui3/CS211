package Homework.Chapter14;

// Jon Formantes
// CS 211  1/30/2023
// Contains several stack/queue methods - stutter, equals, isSorted, and removeMin

import java.util.LinkedList;
import java.util.Queue;

public class Chapter14 {
    public static void main(String[] args) {
        CalendarDate[] store = {new CalendarDate(1,2,10), new CalendarDate(1,1,10), new CalendarDate(12,30,10)};
        Stack<CalendarDate> testAll = new Stack<CalendarDate>();
        for (CalendarDate i: store) testAll.push(i); // build a Stack
        System.out.println(Chapter14.stutter(testAll)); // 6 dates
        System.out.println(Chapter14.equals(testAll,testAll)); // true
		System.out.println(Chapter14.isSorted(testAll)); // false
		for (int i=1;i<=9;i++) testAll.push(new CalendarDate(1,1,10));
		Chapter14.removeMin(testAll);
		while (!testAll.empty())
			System.out.println(testAll.pop().longDate()); // only 2 remain


    }

    // returns a new stack with each entry value of the original repeated
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

    // checks if two stacks are equal to one another
    public static boolean equals(Stack<CalendarDate> s1, Stack<CalendarDate> s2) {
        Stack<CalendarDate> s3 = new Stack<>();
        boolean flag = true;
        if (s1.size() != s2.size()) {
            return false;
        }
        if (s1 == s2) {
            return true;
        }
        while (!s1.empty() && !s2.empty()) {
            if (s1.peek().compareTo(s2.peek()) != 0) {
                flag = false;
            } else {
                s3.push(s1.pop());
                s3.push(s2.pop());
            }
        }
        while (!s3.empty()) {
            s2.push(s3.pop());
            s1.push(s3.pop());
        }
        return flag;
    }

    // checks if a stack is already sorted with the bottom
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
            q.add(s.pop());
        }
        while (!q.isEmpty()) {
            s.push(q.remove());
        }

        while (!s.empty()) {
            q.add(s.pop());
        }
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        return flag;
    }

    // removes minimum value in a stack and returns.
    public static CalendarDate removeMin(Stack<CalendarDate> s) {
        Queue<CalendarDate> q = new LinkedList<>();
        if (s.empty()) {
            return null;
        }

        // obtain first item in stack
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
