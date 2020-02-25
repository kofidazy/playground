package DataStructures.Stack;

import java.util.Arrays;

public class StackAlgorithms {

    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println(Arrays.toString(stack.arr));
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(3);
        stack.push(3);
        stack.push(3);
        stack.push(3);
        stack.push(3);
        stack.push(3);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(6);
        stack.push(6);
        stack.push(6);
        stack.push(6);
        stack.push(6);
        stack.push(7);
        System.out.println(Arrays.toString(stack.arr));
        System.out.println(stack.peek());
        System.out.println(Arrays.toString(stack.arr));

    }
}
