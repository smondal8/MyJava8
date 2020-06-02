package Algorithm;

import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

//https://www.hackerrank.com/challenges/maximum-element/problem
/*
10
1 97
2
1 20
2
1 26
1 20
2
3
1 91
3
 */
public class maximumElement {
    static TreeMap<Integer,Integer> tm = new TreeMap<>();
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int noOfLines = sc.nextInt();
        for (int n = 0; n < noOfLines; n++) {
            String action = sc.next();
            if(action.equals("1")){
                push(stack,sc.next());
            }
            else if(action.equals("2")){
                pop(stack);
            }
            else if(action.equals("3")){
                System.out.println(findMax(stack));
            }
        }
    }

    private static void pop(Stack<Integer> stack) {
        int value = stack.peek();
        if(tm.get(value) > 1){
            tm.put(value,tm.get(value)-1);
        }
        else{
            tm.remove(value);
        }
        stack.pop();
    }

    private static void push(Stack<Integer> stack, String s) {
        stack.push(Integer.parseInt(s));
        if(!tm.containsKey(Integer.parseInt(s))){
            tm.put(Integer.parseInt(s),1);
        }
        else{
            tm.put(Integer.parseInt(s),tm.get(Integer.parseInt(s))+1);
        }
    }

    private static int findMax(Stack<Integer> stack) {
        return tm.lastKey();
    }
}
