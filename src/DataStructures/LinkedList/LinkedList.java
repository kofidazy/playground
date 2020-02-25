package DataStructures.LinkedList;

import java.util.Stack;

public class LinkedList {
    Node head;

    // O(n)
    public void append(Object node) {
        if (head == null) {
            head = new Node(node);
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = new Node(node);
    }

    // O(1)
    public void prepend(Object node) {
        if (head == null) {
            head = new Node(node);
            return;
        }

        Node newHead = new Node(node);
        newHead.next = head;
        head = newHead;
    }

    /**
     * Delete node with value same as parameter value
     * O(n)
     *
     * @param value
     */
    public void deleteWithValue(Object value) {
        if (head == null) {
            return;
        }
        if (head.data == value) {
            head = head.next;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data.equals(value)) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    // O(n)
    public void insertAfter(Object pivot, Object value) {
        if (head == null) return;
        if (head.data == pivot) {
            Node node = new Node(value);
            if (head.next == null) {
                head.next = node;
            } else {
                node.next = head.next;
                head.next = node;
            }
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == pivot) {
                Node node = new Node(value);
                node.next = current.next.next;
                current.next = node;
                return;
            }
            current = current.next;
        }

    }

    public boolean hasCycle() {
        if (head == null) return false;
        Node fast = head.next;
        Node slow = head;
        while (fast != null && fast.next != null && slow != null) {
            if (fast == slow) {
                return true;
            }

            fast = fast.next;
            slow = slow.next;
        }

        return false;
    }

    public void printAll() {
        if (head == null) {
            return;
        }

        Node current = head;
        System.out.print(head.data.toString() + "->");
        while (current.next != null) {
            System.out.print(current.next.data.toString() + "->");
            current = current.next;
        }
        System.out.println("");

    }

    public void findMiddle() {
        if (head == null) {
            return;
        }

        int size = 0;
        Node current = head;
        while (current.next != null) {
            size++;
            current = current.next;
        }
        int count = 0;
        current = head;
        while (current.next != null) {
            if (count == (size / 2)) {
                System.out.println(current.data.toString());
                return;
            }
            current = current.next;
            count++;
        }
    }

    public LinkedList reverse(){
        if (head == null){
            return this;
        }

        Node current = head;
        Stack<Node> stack = new Stack<>();
        stack.push(head);
        while(current.next != null){
            stack.push(current.next);
            current = current.next;
        }

        LinkedList newList = new LinkedList();

        while (!stack.empty()){
            Node popped = stack.pop();
            newList.append(popped.data);
        }

        return newList;
    }
}
