package Homework.Chapter15;

/* No imports required, we're writing our own
 * optional iterator import if your curious
 * 
 * CS211, W.P. Iverson, instructor and author
 * This is a start at test code for Chapter 15 Assignment
 * Other tests can and will happen....
 * version 2023
 */
public class Test {

// Testing for Exercises in Chapter 15
	
	public static void main(String[] args) {
//		ArrayList<Integer> test1 = new ArrayList<>();
//		for(int i=0; i<20; i+=2) test1.add(i);
//		ArrayList<Integer> test2 = new ArrayList<>();
//		for(int i=20; i>0; i-=2) test2.add(i);
//		ArrayList<Double> test3 = new ArrayList<>();
//		test3.add(-5.); test3.add(2.); test3.add(0.); test3.add(-5.);
//		test3.add(-4.); test3.add(-3.); test3.add(-3.); test3.add(100.);
//		ArrayList<Double> empty = new ArrayList<>();
//		ArrayList<String> twos = new ArrayList<>();
//		for(int i=0; i<10; i++) twos.add("2");
//
//		System.out.println("Checking ArrayList...");
//
//		//11
//		System.out.println("REMOVE LAST");
//		System.out.println("Before " + test3);
//		System.out.println("Removed " + test3.removeLast()); //100
//		System.out.println("After " + test3);
//		System.out.println();
//		System.out.println("Before "+ test1);
//		System.out.println("Removed " + test1.removeLast()); //18
//		System.out.println("After "+ test1);
//		System.out.println("\n");
//
//		//12
//		System.out.println("REMOVE FRONT");
//		System.out.println("Before " + test3);
//		System.out.println("Remove 3");
//		test3.removeFront(3);
//		System.out.println("After " + test3);
//		System.out.println();
//		System.out.println("Before "+ test1);
//		System.out.println("Remove 5");
//		test1.removeFront(5);
//		System.out.println("After "+ test1);
//		System.out.println();
//		System.out.println("Before "+ test1);
//		System.out.println("Remove 0");
//		test1.removeFront(0);
//		System.out.println("After "+ test1);
//		System.out.println("\n");
//
//		//15
//		System.out.println("MIRROR");
//		System.out.println("Before " + test3);
//		test3.mirror();
//		System.out.println("After " + test3);
//		System.out.println();
//		System.out.println("Before " + test2);
//		test2.mirror();
//		System.out.println("After " + test2); //[]
//		System.out.println("\n");
//
//		//13
//		System.out.println("REMOVE ALL");
//		System.out.println("Before " + test3);
//		System.out.println("Remove -3");
//		test3.removeAll(-3.0);
//		System.out.println("After " + test3);
//		System.out.println();
//		System.out.println("Before " + twos);
//		System.out.println("Remove 2");
//		twos.removeAll("2");
//		System.out.println("After " + twos); //[]
//		System.out.println("\n");
//
//		//16
//		System.out.println("STUTTER");
//		System.out.println("Before " + test1);
//		test1.stutter();
//		System.out.println("After " + test1);
//		System.out.println();
//		System.out.println("Before " + test3);
//		test3.stutter();
//		System.out.println("After " + test3); //[]
//
//		System.out.println("\n");
//
//		//Empty Array check
//		try {
//			System.out.println("removeLast empty check:");
//			empty.removeLast();
//		} catch(Exception e){
//			System.out.println("Pass");
//		}
//		try {
//			System.out.println("removeFront empty check:");
//			empty.removeFront(5);
//		} catch(Exception e){
//			System.out.println("Pass");
//		}
//		try {
//			empty.removeAll(5.0);
//			empty.mirror();
//			empty.stutter();
//			System.out.println("removeAll, mirror and stutter empty check: Pass");
//		} catch(Exception e){
//			System.out.print("Unexpected Error during empty check");
//			System.out.println(e);
//		}

		ArrayIntList test1 = new ArrayIntList();
		for(int i=0; i<20; i+=2) test1.add(i);
		ArrayIntList test2 = new ArrayIntList();
		for(int i=20; i>0; i-=2) test2.add(i);
		ArrayIntList test3 = new ArrayIntList();
		test3.add(-5); test3.add(2); test3.add(0); test3.add(-5);
		test3.add(-4); test3.add(-3); test3.add(-3); test3.add(100);
		ArrayIntList empty = new ArrayIntList();
		ArrayIntList twos = new ArrayIntList();
		for(int i=0; i<10; i++) twos.add(2);

		//11
		System.out.println("REMOVE LAST");
		System.out.println("Before " + test3);
		System.out.println("Removed " + test3.removeLast()); //100
		System.out.println("After " + test3);
		System.out.println();
		System.out.println("Before "+ test1);
		System.out.println("Removed " + test1.removeLast()); //18
		System.out.println("After "+ test1);
		System.out.println("\n");

		//12
		System.out.println("REMOVE FRONT");
		System.out.println("Before " + test3);
		System.out.println("Remove 3");
		test3.removeFront(3);
		System.out.println("After " + test3);
		System.out.println();
		System.out.println("Before "+ test1);
		System.out.println("Remove 5");
		test1.removeFront(5);
		System.out.println("After "+ test1);
		System.out.println();
		System.out.println("Before "+ test1);
		System.out.println("Remove 0");
		test1.removeFront(0);
		System.out.println("After "+ test1);
		System.out.println("\n");

		//15
		System.out.println("MIRROR");
		System.out.println("Before " + test3);
		test3.mirror();
		System.out.println("After " + test3);
		System.out.println();
		System.out.println("Before " + test2);
		test2.mirror();
		System.out.println("After " + test2); //[]
		System.out.println("\n");

		//13
		System.out.println("REMOVE ALL");
		System.out.println("Before " + test3);
		System.out.println("Remove -3");
		test3.removeAll(-3);
		System.out.println("After " + test3);
		System.out.println();
		System.out.println("Before " + twos);
		System.out.println("Remove 2");
		twos.removeAll(2);
		System.out.println("After " + twos); //[]
		System.out.println("\n");

		//16
		System.out.println("STUTTER");
		System.out.println("Before " + test1);
		test1.stutter();
		System.out.println("After " + test1);
		System.out.println();
		System.out.println("Before " + test3);
		test3.stutter();
		System.out.println("After " + test3); //[]

		System.out.println("\n");

		//Empty Array check
		try {
			System.out.println("removeLast empty check:");
			empty.removeLast();
		} catch(Exception e){
			System.out.println("Pass");
		}
		try {
			System.out.println("removeFront empty check:");
			empty.removeFront(5);
		} catch(Exception e){
			System.out.println("Pass");
		}
		try {
			empty.removeAll(5);
			empty.mirror();
			empty.stutter();
			System.out.println("removeAll, mirror and stutter empty check: Pass");
		} catch(Exception e){
			System.out.print("Unexpected Error during empty check");
			System.out.println(e);
		}
	}

}