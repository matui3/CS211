package Homework.Chapter18;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.NoSuchElementException;
// for Iverson's CS211, Limit yourself to above imports
// these will help us maintain O(log N) run-time for this


// Implements a priority queue of comparable objects using a
// min-heap represented as an array.
public class HeapPriorityQueue<E extends Comparable<E>> {
    private E[] elementData;
    private int size;

    private Comparator<E> comp;

    // Constructs an empty queue.
    @SuppressWarnings("unchecked")
    public HeapPriorityQueue() {
        elementData = (E[]) new Comparable[10]; // was Object
        size = 0;

    }
    
    // ADD METHODS HERE for exercise solutions:

    public HeapPriorityQueue(Collection<E> coll) {
        this();
        for (E i : coll) {
            add(i);
        }
    }

    public HeapPriorityQueue(Comparator<E> comparator) {
        this();
        comp = comparator;
    }

    public E poll() {
        if (isEmpty()) {
            return null;
        } else {
            return remove();
        }
    }


    public HeapPriorityQueue(int val) {
        elementData = (E[]) new Comparable[val];
        size = 0;
    }

    public E[] toArray() {
        E[] arr = (E[]) new Comparable[size];
        for (int i = 1; i <= size(); i++) {
            arr[i-1] = elementData[i];
        }
        return arr;
    }
    
    public void clear() {
        size = 0;
    }

    // need to fix
    public boolean remove(E val) {
        int index = 1;
        boolean found = false;   // have we found the proper place yet?
        while (!found && elementData[index] != null) {
            if (elementData[index].compareTo(val) == 0) {
                found = true;
            } else {
                index++;
            }
        }
        if (elementData[index] == null) {
            return false;
        } else {
            elementData[index] = elementData[size];
            size--;
            boolean placement = false;
            while (!placement && hasLeftChild(index)) {
                int left = leftChild(index);
                int right = rightChild(index);
                int child = left;
                if (hasRightChild(index) && (comp == null ? (elementData[right]).compareTo(elementData[left]) : comp.compare(elementData[right], elementData[left])) < 0) {
                    child = right;
                }

                if (elementData[index].compareTo(elementData[child]) > 0) {
                    swap(elementData, index, child);
                    index = child;
                } else {
                    placement = true;
                }
            }
        }

        return found;
    }


    private boolean check(int index, E o) {
        if (elementData[index].equals(o)) {
            return true;
        }
        return false;
    }
    
    
    
    
    
    
    // Adds the given element to this queue.
    public void add(E value) {
        // resize if necessary
        if (size + 1 >= elementData.length) { // O(N) issue here
            elementData = Arrays.copyOf(elementData, elementData.length * 2);
        }
        
        // insert as new rightmost leaf
        elementData[size + 1] = value;
        
        // "bubble up" toward root as necessary to fix ordering
        int index = size + 1;
        boolean found = false;   // have we found the proper place yet?
        while (!found && hasParent(index)) {
            int parent = parent(index);
            if (comp != null) {
                if (comp.compare(elementData[index], elementData[parent]) < 0) {
                    swap(elementData, index, parent(index));
                    index = parent(index);
                } else {
                    found = true;  // found proper location; stop the loop
                }
            } else {
                if (elementData[index].compareTo(elementData[parent]) < 0) {
                    swap(elementData, index, parent(index));
                    index = parent(index);
                } else {
                    found = true;  // found proper location; stop the loop
                }
            }

        }
        
        size++;
    }
    
    // Returns true if there are no elements in this queue.
    public boolean isEmpty() {
        return size == 0;
    }
    
    // Returns the minimum value in the queue without modifying the queue.
    // If the queue is empty, throws a NoSuchElementException.
    public E peek() {
                if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return elementData[1];
    }
    
    // Removes and returns the minimum value in the queue.
    // If the queue is empty, throws a NoSuchElementException.
    public E remove() {
        E result = peek();

        // move rightmost leaf to become new root
        elementData[1] = elementData[size];
        size--;
        
        // "bubble down" root as necessary to fix ordering
        int index = 1;
        boolean found = false;   // have we found the proper place yet?
        while (!found && hasLeftChild(index)) {
            int left = leftChild(index);
            int right = rightChild(index);
            int child = left;
            if (comp != null) {
                if (hasRightChild(index) &&
                        comp.compare(elementData[right], elementData[left]) < 0) {
                    child = right;
                }
                if (comp.compare(elementData[index], elementData[child]) > 0) {
                    swap(elementData, index, child);
                    index = child;
                } else {
                    found = true;  // found proper location; stop the loop
                }
            } else {
                if (hasRightChild(index) &&
                        elementData[right].compareTo(elementData[left]) < 0) {
                    child = right;
                }

                if (elementData[index].compareTo(elementData[child]) > 0) {
                    swap(elementData, index, child);
                    index = child;
                } else {
                    found = true;  // found proper location; stop the loop
                }
            }

        }
        
        return result;
    }
    
    // Returns the number of elements in the queue.
    public int size() {
        return size;
    }
    
    // Returns a string representation of this queue, such as "[10, 20, 30]";
    // The elements are not guaranteed to be listed in sorted order.
    public String toString() {
        String result = "[";
        if (!isEmpty()) {
            result += elementData[1];
            for (int i = 2; i <= size; i++) {
                result += ", " + elementData[i];
            }
        }
        return result + "]";
    }
    
    
    // helpers for navigating indexes up/down the tree
    private int parent(int index) {
        return index / 2;
    }
    
    // returns index of left child of given index
    private int leftChild(int index) {
        return index * 2;
    }
    
    // returns index of right child of given index
    private int rightChild(int index) {
        return index * 2 + 1;
    }
    
    // returns true if the node at the given index has a parent (is not the root)
    private boolean hasParent(int index) {
        return index > 1;
    }
    
    // returns true if the node at the given index has a non-empty left child
    private boolean hasLeftChild(int index) {
        return leftChild(index) <= size;
    }
    
    // returns true if the node at the given index has a non-empty right child
    private boolean hasRightChild(int index) {
        return rightChild(index) <= size;
    }
    
    // switches the values at the two given indexes of the given array
    private void swap(E[] a, int index1, int index2) {
        E temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }
}
