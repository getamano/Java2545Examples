package week4_list_data_structure;

import java.util.Deque;
import java.util.LinkedList;


/**
 * LinkedList as a Stack
 */
public class LinkedListStack {

    public static void main(String[] args) {

        // Here, the linked list is behaving as a double ended queue
        Deque<Integer> stack = new LinkedList<>();

        stack.push(4);
        stack.push(10);
        stack.push(106);

        //What's the top element?
        System.out.println("Top element=" + stack.peek());

        System.out.println(stack.pop()); //remove the top element
        System.out.println(stack.pop()); //remove the top element
        System.out.println(stack.pop()); //remove the top element

        System.out.println(stack.pop()); //what does this do?
    }

}
