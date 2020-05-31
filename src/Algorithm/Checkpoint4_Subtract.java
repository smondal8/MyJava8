package Algorithm;

import java.util.Stack;

//https://www.interviewbit.com/problems/subtract/
public class Checkpoint4_Subtract {
    public ListNode subtract(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode current = head;
        ListNode advance = head;
        while (current != null) {
            stack.push(current.val);
            current = current.next;
        }
        //ListNode newList;
        current = head;
        while (advance != null && advance.next != null) {
            //System.out.print(current.val);
            //System.out.print(stack.peek());
            current.val = stack.pop() - current.val;
            current = current.next;
            advance = advance.next.next;
        }
        return head;
    }
}
