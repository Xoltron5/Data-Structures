import java.util.LinkedList;
import java.util.Queue;

public class Queues {

    // enqueue = offer() adds an element to the tail of the queue
    // dequeue = poll() removes an element from the head of the queue 

    // Queue is an interface. We need to instanitate a class that implments this
    // interface. Linked List or a Priorty Queue.
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Denis");
        queue.offer("Sarah");
        queue.offer("Smith");
        queue.offer("John");

        System.out.println(queue);

        System.out.println(queue.peek());

        String name = queue.poll();
    
        System.out.println(queue.isEmpty());
    
        System.out.println(queue.size());
    
        System.out.println("Contains Noob: " + queue.contains("Noob"));
    
        System.out.println("name: " + name);    

        queue.offer("Luc");

        System.out.println(queue);

        System.out.println("Size: " + queue.size());

    } 
}
