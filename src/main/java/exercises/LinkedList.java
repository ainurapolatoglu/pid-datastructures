package exercises;

// This class is used for each "box".
class Node {
    int elem;
    Node next;
    // so we can do new Node(5, null) etc.
    Node(int elem, Node next) {
        this.elem = elem;
        this.next = next;
    }
}

public class LinkedList {
    private Node first = null;
    private Node last = null;

    /** Adds an integer element to the end of the
     * linked list.
     * @param elem The element to add.
     */
    public void add(int elem) {
        // 1. case: list is empty
        if (first == null) {
            first = new Node(elem, null);
            last = first;
        } else { // 2. case: list is non-empty
            // at least one node already exists!
            // this means, the `first` field is not null.

            Node nodeForElem = new Node(elem, null);
            // node that used to be last needs to be
            // connected to our new node!

            last.next = nodeForElem;
            last = nodeForElem;
        }
    }

    // get method
    public int get(int index) {
        // 1. case: index == 0
        if (index == 0) {
            return first.elem;
        } else { // 2. case: index > 0
            // not yet implemented
            return -1; // not correct!
        }
    }

    //size method
    public int size() {
        int count = 0;
        Node current = first;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}
