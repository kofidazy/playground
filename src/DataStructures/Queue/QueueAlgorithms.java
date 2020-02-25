package DataStructures.Queue;

import java.util.Arrays;

public class QueueAlgorithms {

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(9);
        queue.enqueue(8);
        queue.enqueue(7);
        System.out.println(Arrays.toString(queue.arr));
        System.out.println(queue.dequeue());
        System.out.println(Arrays.toString(queue.arr));
        System.out.println(queue.dequeue());
        System.out.println(Arrays.toString(queue.arr));
    }
}
