package BJPExercises.Chapter10;

import java.util.*;
/** Name	Course	Quarter		Date		Assignment
 *
 * BC CS211
 * Selected Chapter 10 Exercises
 * 
 * W.P. Iverson, January 2022
 */
public class Exercises10
{
    public static void main(String[] alot587) {
	    
        // Initialize an array of Strings, then load into a String List:
        String[] arrayS = {"four", "score", "and", "seven", "years", "ago"};
        ArrayList<String> testListS = new ArrayList<String>();      
        for (String s: arrayS) testListS.add(s);
        
        // Initialize an Integer array of int data, then load into an Integer List
        Integer[] arrayI = {3, 8, 92, 4, 2, 17, 9};
        ArrayList<Integer> testListI = new ArrayList<Integer>();      
        for (int i: arrayI) testListI.add(i); 
        
        // Use Iversons CalendarDate, so we MUST use compareTo concept
        ArrayList<CalendarDate> testListC = new ArrayList<CalendarDate>();
        testListC.add(new CalendarDate(10,12,1314));  testListC.add(new CalendarDate(10,12,1314));
        testListC.add(new CalendarDate(2,14,2022));  testListC.add(new CalendarDate(3,21,2022));
         
        // Exercise 10.2
        System.out.println(testListS);
        //swapPairs(testListS);
        System.out.println("10.2 swapPairs: "+ testListS); 
        System.out.println();
        
        // Exercise 10.6
        System.out.println(testListI);
        //minToFront(testListI);
        System.out.println("10.6 minToFront: " + testListI);
        System.out.println();
        
        // Exercise 10.7
        System.out.println(testListC);
        removeDuplicates(testListC);
        System.out.println("10.7 removeDuplicates: " + testListC);
        System.out.println();
        
        // Exercise 10.12
        System.out.println(testListS);
        //markLength4(testListS);
        System.out.println("10.12 markLength4: " + testListS);
        System.out.println();
    
        // Exercise 10.18
        System.out.println(testListS);
        //mirror(testListS);
        System.out.println("10.18 mirror: " + testListS);
        System.out.println();
    }

    public static void removeDuplicates(ArrayList<CalendarDate> list) {
        int length = list.size();
        for (int i = 0; i < length - 1; i++) {
            if (list.get(i).compareTo(list.get(i+1)) == 0) {
                list.remove(i);
                i--;
                length--;

            }
        }
    }
}