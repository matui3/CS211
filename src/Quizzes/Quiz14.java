package Quizzes;// Jon Formantes
// CS 211  1/30/2023
// removes even numbers from a stack

public class Quiz14 {
    public static void main(String[] arg161) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(8);
        stack.push(7);
        stack.push(2);
        stack.push(9);
        stack.push(18);
        stack.push(2 * 20);
        stack.push(0);
//        for (int i = 0; i < 20; i++) {
//            if (i % 2 == 0) {
//                stack.push(2*i + 1);
//            } else {
//                stack.push(i);
//            }
//        }
        System.out.println("bottom " + stack.toString() + " top");
        removeEvenNumbers(stack);
        System.out.println("bottom " + stack.toString() + " top");
    }


    // removes even numbers from stack
    public static void removeEvenNumbers(Stack<Integer> s) {
        Stack<Integer> stack = new Stack<>();
        while (!s.empty()) {
            int top = s.pop();
            if (top % 2 != 0) {
                stack.push(top);
            }
        }
        while (!stack.empty()) {
            s.push(stack.pop());
        }
    }
}