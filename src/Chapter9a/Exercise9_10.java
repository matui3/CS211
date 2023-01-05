package Chapter9a;

/*
 * W.P. Iverson, January 2023
 * copied from https://practiceit.cs.washington.edu/problems/bjp5/chapter9/GroceryBill.java
 * so we can work Exercise BJP4 Exercise 9.10: Chapter9.DiscountBill
 * 
 * for Bellevue College, CS211
 */
public class Exercise9_10 {

	public static void main(String[] args2023) {
		// a portion of test #1 in Practice-IT
		DiscountBill test1 = new DiscountBill(new Employee("clerk-1"), false);
		System.out.println("test #1 Chapter9.DiscountBill(clerk, preferred)");
		System.out.println("preferred: false");
		test1.add(new Item("candy bar", 1.35, 0.25));
		test1.add(new Item("toy car", 3.25, 0.5));
		test1.add(new Item("apple", 0.3, 0.05));
		test1.add(new Item("orange", 0.3, 0.05));
		test1.add(new Item("newspaper", 0.99, 0.0));
//		System.out.println("clerk: clerk-1");
		System.out.println(test1);
		System.out.println("clerk: "+test1.getClerk());
		System.out.println("getTotal(): "+test1.getTotal());
		
		// a portion of test #2 in Practice-IT
		DiscountBill test2 = new DiscountBill(new Employee("clerk-2"), true);
		System.out.println("\ntest #2  getTotal()");
		System.out.println("preferred: true");
		test2.add(new Item("candy bar", 1.35, 0.25));
		test2.add(new Item("toy car", 3.25, 0.5));
		test2.add(new Item("apple", 0.3, 0.05));
		test2.add(new Item("orange", 0.3, 0.05));
		test2.add(new Item("newspaper", 0.99, 0.0));
		System.out.println(test2.discountToString());
		System.out.println("Discounted # of items: " + test2.getDiscountCount());
		System.out.println("Total amount of discount: " + test2.getDiscountAmount());
		System.out.println(0.25+0.5+0.05+0.05+0.0);
		System.out.println(test2); // .toString() is THE JAVA standard
		System.out.println("getTotal(): "+test2.getTotal());

		DiscountBill test3 = new DiscountBill();
		test3.add(new Item("candy bar", 1.35, 0.25));
		test3.add(new Item("toy car", 3.25, 0.5));
		test3.add(new Item("apple", 0.3, 0.05));
		test3.add(new Item("orange", 0.3, 0.05));
		test3.add(new Item("newspaper", 0.99, 0.0));
		System.out.println("clerk: " + test3.getClerk());
		System.out.println(test3);

		DiscountBill test4 = new DiscountBill(true);
		System.out.println(test4.getClerk());
		System.out.println(test4);

		GroceryBill bill = new GroceryBill(new Employee());
		System.out.println(bill);

		Employee e = new Employee();
		System.out.println(e);

		DiscountBill test5 = new DiscountBill();
	}

}
