package Algorithm;

import java.util.HashSet;
import java.util.List;

class ListNode {
       public int val;
       public ListNode next;
       ListNode(int x) { val = x; next = null; }
   }
public class PoblemSolving {
    public static void main(String[] args) {

    }
    public ListNode deleteDuplicates(ListNode A) {
        HashSet<Integer> hs = new HashSet<>();
        ListNode interim = A;
        ListNode prev = null;
        if(A == null){
            return null;
        }
        while(interim.next != null){
            if(hs.contains(interim.val)){
                deleteNode(prev,interim);
            }
            else{
                hs.add(interim.val);
                prev = interim;
            }
            interim = interim.next;
        }
        return A;
    }

    private void deleteNode(ListNode prev, ListNode a) {
        prev.next = a.next;
    }
}
