package week4_list_data_structure;

import java.util.Deque;
import java.util.LinkedList;

/**
 * LinkedList as a Stack - used to reverse the order of a set of data
 */
public class LinkedListStackReverseOrder {

    public static void main(String[] args) {

        Deque<Integer> numbers = new LinkedList<>();

        numbers.push(100);
        numbers.push(200);
        numbers.push(300);   // push() adds the item to the front of the list

        System.out.println("The numbers are " + numbers);    // [ 300, 200, 100 ]

        Deque<Integer> numbersReversed = new LinkedList<>();

        while (numbers.peek() != null) {

            // pop one element off numbers, and push it onto numbersReversed
            numbersReversed.push( numbers.pop() );
        }

        System.out.println("Numbers in reverse order " + numbersReversed);

    }

}
