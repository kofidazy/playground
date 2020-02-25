package DataStructures.Stack;

public class Stack {
    int MAX = 10;
    int top;
    int arr[] = new int[MAX];

    Stack(){
        top = -1;
    }

    boolean isEmpty(){
        if (top < 0){
            System.out.println("Stack Underflow");
            return true;
        }
        return false;
    }

    /**
     * O(1)
     * if array gets full 0(n) for next insert
     *
     * @return
     */
    boolean push(int a){
        int current = top;
        if (current >= (MAX-1)){
            int newMAX = MAX + (MAX/2);
            int[] newArr = new int[newMAX];
            for (int i = 0; i < MAX - 1; i++) {
                newArr[i] = arr[i];
            }
            MAX = newMAX;
            this.arr = newArr;
            this.arr[top] = a;
            return true;
        }
        top++;
        arr[top] = a;
        return true;
    }

    // O(1)
    int pop(){
        if (this.isEmpty()){
            return 0;
        }

        int popped = arr[top];
        arr[top] = 0;
        top--;
        return popped;
    }

    int peek(){
        if (this.isEmpty()){
            return 0;
        }

        int popped = arr[top];
        return popped;
    }
}
