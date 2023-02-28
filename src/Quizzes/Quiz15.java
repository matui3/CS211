package Quizzes;

public class Quiz15 {
    public static void main(String[] arg881) {
        ArrayIntList quiz15 = new ArrayIntList();
        quiz15.add(1);
        quiz15.add(8);
        quiz15.add(7);
        quiz15.add(2);
        quiz15.add(9);
        quiz15.add(18);
        quiz15.add(2 * 17);
        quiz15.add(0);
        ArrayIntList quiz = new ArrayIntList();
        int[] arr = {2,2,2,2,2,2,2,2,2,2,1,2,2};
        for (int i : arr) {
            quiz.add(i);
        }

        ArrayIntList empty = new ArrayIntList();
        System.out.println(empty);
        empty.removeEvenNumbers();
        System.out.println(empty);

        System.out.println(quiz);
        quiz.removeEvenNumbers();
        System.out.println(quiz);

        System.out.println(quiz15);
        quiz15.removeEvenNumbers();
        System.out.println(quiz15);
    }
}