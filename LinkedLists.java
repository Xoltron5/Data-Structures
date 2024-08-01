// import java.util.LinkedList;

public class LinkedLists {
    
    public static void main(String[] args) {

        MyLinkedList mylist = new MyLinkedList();

        mylist.add(1);
        mylist.add(2);
        mylist.add(3);

        mylist.addFirst(5);
        mylist.addLast(10);

        System.out.println(mylist);
        System.out.println(mylist.length);

        //LinkedList<String> linkedList = new LinkedList<String>();

        // We can use linked lists as a stack. 

        // linkedList.push("A");
        // linkedList.push("B");
        // linkedList.push("C");
        // linkedList.push("X");

        // linkedList.pop();

        // A is Head, X is Tail.

        // We can use linked lists as a queue. 
        // linkedList.offer("A");
        // linkedList.offer("B");
        // linkedList.offer("C");
        // linkedList.offer("X");

        // linkedList.poll();

        // linkedList.add(4,"E");
        // linkedList.remove("E");

        // //System.out.println(linkedList.indexOf("F"));

        // System.out.println(linkedList.peekFirst());
        // System.out.println(linkedList.peekLast());
    
        // linkedList.addFirst("0");

        // linkedList.addLast("S");

        // System.out.println(linkedList);
    }
}
