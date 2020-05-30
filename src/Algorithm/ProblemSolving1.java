package Algorithm;

import java.util.Stack;

public class ProblemSolving1 {
    public static void main(String[] args) {


    }
    public int lPalin(ListNode A) {
        Stack<Integer> stack = new Stack<>();
        ListNode interim = A;
        while(interim != null){
            stack.push(interim.val);
            interim = interim.next;
        }
        interim = A;
        while(interim != null){
            if(interim.val != stack.pop()){
                return 0;
            }
            interim = interim.next;
        }
        return 1;

    }
}
