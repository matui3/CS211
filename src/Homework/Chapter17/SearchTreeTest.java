package Homework.Chapter17;

public class SearchTreeTest {
    public static void main(String[] args) {
        SearchTree<Integer> tree = new SearchTree<>();
        tree.add(2); tree.add(1);  tree.add(3);
        tree.add(7); tree.add(8); tree.add(6);

        SearchTree<Integer> tree1 = new SearchTree<>();
        SearchTree<Integer> tree2 = new SearchTree<>();
        tree1.add(2); tree1.add(1);  tree1.add(3);
        tree1.add(7); tree1.add(8); tree1.add(6);

        tree2.add(2); tree2.add(1);  tree2.add(3);
        tree2.add(7); tree2.add(8); tree2.add(6);

        System.out.println(tree.isFull()); // false


        System.out.println(tree1);
        System.out.println(tree2);
        System.out.println(tree1.equals(tree2)); // true
//        tree1.removeLeaves();
        System.out.println(tree1.remove(7));
    }
}
