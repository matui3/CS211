package Homework.Chapter14;

import java.util.LinkedList;
import java.util.Queue;

/* February 2017, CS211, W.P. Iverson, instructor and author
 * this is a start at testing code for Chapter 14 assignment
 * other tests can and will happen....
 */
public class Post {
	public static void main(String[] args) {
		// store some dates so they can be reused
		//stacks to test
		Stack<CalendarDate> stack = new Stack<>();
		for(int i = 20; i > 10; i--) {
			stack.push(new CalendarDate(1,i,92));
		}
		Stack<CalendarDate> stack2 = new Stack<>();
		for(int i = 1; i < 10; i++) {
			stack2.push(new CalendarDate(i,1,92));
		}
		Stack<CalendarDate> stack3 = new Stack<>();
		for(int i = 1; i < 10; i++) {
			stack3.push(new CalendarDate(i,1,92));
		}
		Stack<CalendarDate> empty = new Stack<>();

		//test cases
		System.out.println(stack);
		System.out.println(Chapter14.stutter(stack)); //do they repeat?
		System.out.println(Chapter14.equals(stack, stack2)); //false
		System.out.println(Chapter14.equals(stack2, stack3)); //true
		System.out.println(Chapter14.isSorted(stack2));	//false
		System.out.println(Chapter14.isSorted(stack));	//true


		System.out.println();
		System.out.println("Before: " + stack);
		System.out.println(Chapter14.removeMin(stack)); //1/11/92
		System.out.println("After: " +stack); //did it delete that number ^?

		System.out.println();
		System.out.println("Before: " +stack2);
		System.out.println(Chapter14.removeMin(stack2)); //1/1/92
		System.out.println("After: " +stack2); //did it delete that number ^?

		//Do they work with empty stacks?
		System.out.println();
		System.out.println(Chapter14.stutter(empty)); //Should be empty -> []
		System.out.println(Chapter14.equals(empty,empty)); //true
		System.out.println((Chapter14.isSorted(empty))); //true
		System.out.println(Chapter14.removeMin(empty)); //null
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
