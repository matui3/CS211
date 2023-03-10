package Homework.Chapter17;

public class SearchTreeTest {
    public static void main(String[] args) {
        SearchTree<Integer> tree999 = new SearchTree<Integer>();
        tree999.add(2);  tree999.add(1);  tree999.add(7);  tree999.add(4);
        tree999.add(8);  tree999.add(0);  tree999.add(6);  tree999.add(9); tree999.add(3);
        SearchTree<Integer> tree99 = new SearchTree<Integer>();
        tree99.add(2);  tree99.add(1);  tree99.add(7);  tree99.add(4);
        tree99.add(8);  tree99.add(0);  tree99.add(6);  tree99.add(9);
        System.out.println("\n------------------------\n");
        System.out.println(tree999.equals(tree99));
        System.out.println(tree99);
        System.out.println(tree999);
        System.out.println("remove");
        tree999.remove(4);
        tree999.remove(123123);
        //tree999.print();
        System.out.println(tree999);
        System.out.println("removeLeaves");
        tree999.removeLeaves();
        System.out.println(tree999);
        System.out.println(tree999.equals(tree99));
        System.out.println(tree999.isFull());
        System.out.println(tree999);
    }
}
