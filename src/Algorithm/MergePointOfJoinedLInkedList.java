package Algorithm;
//https://www.hackerrank.com/challenges/find-the-merge-point-of-two-joined-linked-lists/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=linked-lists
class SinglyLinkedListNode {
         int data;
         SinglyLinkedListNode next;
}
public class MergePointOfJoinedLInkedList {
    static int findMergeNode(SinglyLinkedListNode headA, SinglyLinkedListNode headB) {
        SinglyLinkedListNode currentA = headA;
        SinglyLinkedListNode currentB = headB;

        //Do till the two nodes are the same
        while (currentA != currentB) {
            //If you reached the end of one list start at the beginning of the other one
            //currentA
            if (currentA.next == null) {
                currentA = headB;
            } else {
                currentA = currentA.next;
            }
            //currentB
            if (currentB.next == null) {
                currentB = headA;
            } else {
                currentB = currentB.next;
            }
        }
        return currentB.data;
    }
}
