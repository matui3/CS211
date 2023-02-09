package Homework.Chapter14;

import java.util.LinkedList;
import java.util.Queue;

public class Chapter14 {
    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 14, 9};
        Stack<Integer> s = new Stack<>();
        for (int i : arr) {
            s.push(i);
        }
        System.out.println(s);
        System.out.println(stutter(s));
        System.out.println(s);


    }

    public static Stack<Integer> stutter(Stack<Integer> s) {
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> q = new LinkedList<>();
        while (!s.empty()) {
            int num = s.pop();
            q.add(num);
        }

        while (!q.isEmpty())     {
            int val = q.remove();
            s.push(val);
        }

        while (!s.empty()) {
            int num = s.pop();
            q.add(num);
            stack.push(num);
            stack.push(num);
        }

        while (!q.isEmpty()) {
            int val = q.remove();
            s.push(val);
        }

        return stack;
    }

    public static boolean equals(Stack<Integer> s1, Stack<Integer> s2) {
        Stack<Integer> s3 = new Stack<>();
        if (s1.size() != s2.size()) {
            return false;
        }
        boolean flag = true;
        while (!s1.empty()) {
            int one = s1.pop();
            int two = s2.pop();
            s3.push(one);
            s3.push(two);
            if (one != two) {
                flag = false;
            }
        }

        while (!s3.empty()) {
            int first = s3.pop();
            int second = s3.pop();
            s2.push(first);
            s1.push(second);
        }
        return flag;
    }

    public static boolean isSorted(Stack<Integer> s) {

        Queue<Integer> q = new LinkedList<>();
        boolean flag = true;
        while (s.size() >= 2) {
            int first = s.pop();
            int second = s.pop();
            q.add(first);
            s.push(second);

            if (second < first) {
                flag = false;
            }
        }
        while (!s.empty()) {
            int last = s.pop();
            q.add(last);
        }
        while (!q.isEmpty()) {
            int val = q.remove();
            s.push(val);
        }

        while (!s.empty()) {
            int num = s.pop();
            q.add(num);
        }

        while (!q.isEmpty()) {
            int front = q.remove();
            s.push(front);
        }
        return flag;
    }

}
