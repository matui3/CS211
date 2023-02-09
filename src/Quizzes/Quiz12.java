package Quizzes;// Jon Formantes
// 1/31/2023
// CSE 211 - Winter
// Recursive method that String as a parameter and that returns a new string obtained by replacing every sequence of repeated adjacent letters with just one of that letter.


public class Quiz12 {
    // copyright 2023 Bellevue College
    public static void main(String[] x182) {
        System.out.println(compress("bookkkkkeeper"));
        System.out.println(compress("String"));
        System.out.println(compress(""));
        System.out.println(compress("bbookkeerr"));
        System.out.println(compress("bbbbbooookkkeer"));
        System.out.println(compress("j"));
        System.out.println(compress("'''aaeaabbdbbccc"));
        System.out.println(compress("llmmaaoolmaolmao"));
    }

    // removes adjacent letters from a string aarameter. returns a new string with relaced adjacent of just one of that letter
    public static String compress(String s) {
        String result = "";
        if (s.length() <= 1) {
            return s;
        } else {
            if (s.charAt(0) != s.charAt(1)) {
                result += s.charAt(0);
            }
            return result + compress(s.substring(1));
        }
    }
}