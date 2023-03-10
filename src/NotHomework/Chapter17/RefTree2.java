package NotHomework.Chapter17;

import Quizzes.IntTree;
import Quizzes.IntTreeNode;

/**
 * BJP, reference tree #2
 * page 1076, for exercises #16 and #17
 * 
 * client driver for CS211 code exercises in IDE
 * by W.P. Iverson, Bellevue College, February 2023
 */
public class RefTree2
{
    public static void main(String[] args) {

    	// create the nodes we need
        IntTreeNode one = new Quizzes.IntTreeNode(0,null,null);
        IntTreeNode two = new Quizzes.IntTreeNode(0,null,null);
        two = new Quizzes.IntTreeNode(2,null,new Quizzes.IntTreeNode(9,null,new Quizzes.IntTreeNode(0,null,null)));
        one = new Quizzes.IntTreeNode(1,new Quizzes.IntTreeNode(8,new Quizzes.IntTreeNode(7,null,null),null),two);

        Quizzes.IntTree quiz17 = new Quizzes.IntTree(one);

        System.out.println(quiz17);
        System.out.println("---------------------------");
        quiz17.removeEvenNumbers();
        System.out.println(quiz17);

        // Some other trees to test
        Quizzes.IntTree quiz17zero = new Quizzes.IntTree();
        // empty tree test
        System.out.println("BEFORE:");
        System.out.println(quiz17zero);
        quiz17zero.removeEvenNumbers();
        System.out.println("AFTER:");
        System.out.println(quiz17zero);


        Quizzes.IntTreeNode odds = new IntTreeNode(1,null, null);
        Quizzes.IntTree allOdds = new Quizzes.IntTree(odds);


        System.out.println("BEFORE:");
        System.out.println(allOdds);
        allOdds.removeEvenNumbers();
        System.out.println("AFTER:");
        System.out.println(allOdds);


        IntTree quiz170 = new IntTree(170);
        System.out.println("BEFORE:");
        System.out.println(quiz170);
        quiz170.removeEvenNumbers();
        System.out.println("AFTER:");
        System.out.println(quiz170);

        IntTree quiz9 = new IntTree(9);
        System.out.println(quiz9);
        quiz9.removeEvenNumbers();
        System.out.println(quiz9);
//        System.out.println("\n------------------------\n");
//        System.out.println(tree999);
    }
}
