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

    Node(int elem){
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
        Node tmp = first;
        int counter = 0;
        while (counter < index && tmp.next != null) {
            tmp = tmp.next;
            counter++;
        }
        if (counter == index) {
            return tmp.elem;
        } else {
            throw new IndexOutOfBoundsException();
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

    //remove method
    public void remove(int index) {
        int count = 0;
        Node current = first;

        if (current == null)
            return;

        if (index == 0)
        {
            first = current.next;   // Change head
            return;
        }

        for (int i=0; current!=null && i<index-1; i++)
            current = current.next;
        Node next = current.next.next;
        current.next = next;
    }

    //show method
    public void printList()
    {
        Node tnode = first;
        while (tnode != null)
        {
            System.out.print(tnode.elem+" ");
            tnode = tnode.next;
        }
    }
}
