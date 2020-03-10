package exercises;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello, SDA");

        LinkedList list = new LinkedList();
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(6);
        int elem = list.get(0);
        System.out.println("first elem: " + elem);
        System.out.println("Size of list:" + list.size());
    }
}
