package LinkedList;

import java.util.*;

public class CountPairs {
    //Complexity : O(n^2)
    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2, int x)
    {
        Iterator itr1 = head1.iterator();
        Iterator itr2 = head2.iterator();
        int count = 0;
        HashSet<Integer> hs = new HashSet<>();
        while(itr1.hasNext()){
            hs.add(Integer.parseInt(itr1.next().toString()));
        }
        while(itr2.hasNext()){
            if(hs.contains(x- Integer.parseInt(itr2.next().toString()))){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Integer arr1[] = {1,2,3,4,5,6};
        Integer arr2[] = {11,12,13};

        // create linked list1 3->1->5->7
        LinkedList<Integer> head1 = new LinkedList<>(Arrays.asList(arr1));

        // create linked list2 8->2->5->3
        LinkedList<Integer> head2 = new LinkedList<>(Arrays.asList(arr2));

        int x = 15;

        System.out.println("Count = " + countPairs(head1, head2, x));
    }
}
