package Algorithm;
//https://www.interviewbit.com/problems/remove-duplicates-from-sorted-list-ii/
public class removeDuplicateList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        ListNode checker = head.next;
        if(head == null || head.next == null){
            return head;
        }
        while(current != null){
            while(checker != null && checker.val == current.val){
                checker = checker.next;
            }
            //incase issue repeatation is there in intial part of list

            if(current.next == checker){
                prev = current;
                current = checker;
            }
            else if(prev == null){
                head = checker;
                current = checker;
            }
            else{
                prev.next = checker;
                current = checker;
            }
            if(checker != null) checker = checker.next;
        }
        return head;
    }
}
