package DataStructures.Queue;

public class Queue {
    int MAX = 10;
    int top;
    int arr[] = new int[MAX];

    Queue(){
        top = -1;
    }

    boolean isEmpty(){
        if (top < 0){
            System.out.println("Stack Underflow");
            return true;
        }
        return false;
    }

    // 0(1)
    int enqueue(int a){
        int current = top + 1;
        arr[current] = a;
        top++;
        return a;
    }

    // 0(n)
    int dequeue(){
        int x = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i+1];
        }
        return x;
    }

}
