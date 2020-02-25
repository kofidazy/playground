package DataStructures.LinkedList;

import DataStructures.LinkedList.LinkedList;

/*
Advantages - prepending elements O(1), appending elements 0(n)
Disadvantages - traversing, finding the nth item in a linkedlist takes time
 proportional to the length of the list 0(n)
 */
public class LinkedListAlgorithms {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.append("Kofi");
        linkedList.append("Ama");
        linkedList.printAll();
        linkedList.prepend("Kwadwo");
        linkedList.prepend("Kojo");
        linkedList.printAll();
        linkedList.deleteWithValue("Kofi");
        linkedList.printAll();
        linkedList.insertAfter("Kojo","Kwame");
        linkedList.printAll();
        System.out.println("Reversed--------->");
        linkedList.reverse().printAll();

    }
}
