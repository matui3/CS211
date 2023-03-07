package Homework.Chapter17;

// Jon Formantes
// 3/6/2023
// Winter 2023 - CS211
// Implements four methods, remove, isFull, removeLeaves, and equals

public class SearchTree<E extends Comparable<E>> {
    private SearchTreeNode<E> overallRoot; // root of overall tree

    // post: constructs an empty search tree
    public SearchTree() {
        overallRoot = null;
    }
    
    // WRITE ADDITIONAL METHODS HERE:

    // checks if every branch node has two children or zero - aka a full tree
    public boolean isFull() {
        if (overallRoot == null) {
            return true;
        } else {
            boolean flag = true;
            return helperIsFull(overallRoot, flag);
        }
    }

    // helper method for isFull (checks for full tree)
    // checks if null;
    private boolean helperIsFull(SearchTreeNode<E> root, boolean flag) {
        // case 1:
        if (root.left == null && root.right == null && flag) {
            return true;
        } else if (root.left != null && root.right == null || root.left == null && root.right != null && flag) {
            return false;
        } else {
            return helperIsFull(root.left, flag) && helperIsFull(root.right, flag);
        }
    }

    // used the following website for help in determining steps: https://www.geeksforgeeks.org/write-c-code-to-determine-if-two-trees-are-identical/
    // checks if two trees have the same structure and value
    public boolean equals(SearchTree<E> tree2)  {
        return helperEquals(overallRoot, tree2.overallRoot);
    }

    // helper method for equals method - checks if two trees are identical
    private boolean helperEquals(SearchTreeNode<E> root, SearchTreeNode<E> root2) {
        if (root == null && root2 == null) {
            return true;
        } else if (root != null && root2 != null) {
            if (root.data.compareTo(root2.data) == 0) {
                return helperEquals(root.left, root2.left) && helperEquals(root.right, root2.right);
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    // removes the leaves of a tree
    public void removeLeaves() {
        if (overallRoot == null) {
            return;
        }
        overallRoot = removeLeafHelper(overallRoot);
    }

    // helper method to remove the leaves from a tree using the x = change(x) principle
    private SearchTreeNode<E> removeLeafHelper(SearchTreeNode<E> root) {
        // base case
        if (root == null) {
            return null;
        } else if (root.left == null && root.right == null) {
            return null;
        } else {
            root.left = removeLeafHelper(root.left);
            root.right = removeLeafHelper(root.right);
            return root;
        }
    }

    // code taken from BJP PowerPoint - Binary Trees
    public void remove(E data) {
        overallRoot = removeHelper(overallRoot, data);
    }

    // code taken from BJP PowerPoint - Binary Trees - On remove slide. Handles leaf case, null case
    private SearchTreeNode<E> removeHelper(SearchTreeNode<E> root, E data) {
        if (root == null) {
            return null;
        } else {
            if (data.compareTo(root.data) < 0) {
                root.left = removeHelper(root.left, data);
            } else if (data.compareTo(root.data) > 0) {
                root.right = removeHelper(root.right, data);
            } else {
                if (root.left == null && root.right == null) {
                    return null;
                } else if (root.right == null) {
                    return root.left;
                } else if (root.left == null) {
                    return root.right;
                } else {
                    root.data = getMin(root.right);
                    root.right = removeHelper(root.right, root.data);
                }
            }
        }
        return root;
    }

    // method for determining minimum node from a root
    private E getMin(SearchTreeNode<E> root) {
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    // post: value added to tree so as to preserve binary search tree
    public void add(E value) {
        overallRoot = add(overallRoot, value);
    }

    // post: value added to tree so as to preserve binary search tree
    private SearchTreeNode<E> add(SearchTreeNode<E> root, E value) {
        if (root == null) {
            root = new SearchTreeNode<E>(value);
        } else if (root.data.compareTo(value) > 0) {
            root.left = add(root.left, value);
        } else if (root.data.compareTo(value) < 0) {
            root.right = add(root.right, value);
        }
        return root;
    }

    // post: returns true if tree contains value, returns false otherwise
    public boolean contains(E value) {
        return contains(overallRoot, value);
    }   

    // post: returns true if given tree contains value, returns false otherwise
    private boolean contains(SearchTreeNode<E> root, E value) {
        if (root == null) {
            return false;
        } else {
            int compare = value.compareTo(root.data);
            if (compare == 0) {
                return true;
            } else if (compare < 0) {
                return contains(root.left, value);
            } else {   // compare > 0
                return contains(root.right, value);
            }
        }
    }

    // post: prints the data of the tree, one per line
    public void print() {
        printInorder(overallRoot);
    }

    // post: prints the data of the tree using an inorder traversal
    private void printInorder(SearchTreeNode<E> root) {
        if (root != null) {
            printInorder(root.left);
            System.out.println(root.data);
            printInorder(root.right);
        }
    }
    
    // toString() added by W.P. Iverson for simple console testing
    // since String is immutable, I've used StringBuilder
    public String toString() {
    	StringBuilder s = new StringBuilder();
    	toString(overallRoot, 0, s);
    	return s.toString();
    }
    
    // similar reverse in order traversal of tree as print sideways
    private void toString(SearchTreeNode<E> root, int level, StringBuilder s) {
        if (root != null) {
            toString(root.right, level + 1, s);
            String temp = new String(); // different for each node
            for (int i = 0; i < level; i++) {
            	temp += "    ";
            }
            s.append(temp + root.data + "\n"); // uses same String in recursions
            toString(root.left, level + 1, s);
        }
    }

    
    
    // a private inner Class for the search tree nodes
    // there is no use for such nodes outside of the SearchTree Class
    // so a private inner Class is appropriate in this case...
    private static class SearchTreeNode<E> {
        public E data;                   // data stored in this node
        public SearchTreeNode<E> left;   // left subtree
        public SearchTreeNode<E> right;  // right subtree

        // post: constructs a leaf node with given data
        public SearchTreeNode(E data) {
            this(data, null, null);
        }

        // post: constructs a node with the given data and links
        public SearchTreeNode(E data, SearchTreeNode<E> left,
                              SearchTreeNode<E> right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
}
