package Algorithm;
//https://www.hackerrank.com/challenges/insert-a-node-into-a-sorted-doubly-linked-list/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=linked-lists
    class DoublyLinkedListNode {
             int data;
             DoublyLinkedListNode next;
             DoublyLinkedListNode prev;
    }
public class insertelementInDoublyLInkedList {
    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
        DoublyLinkedListNode sol = head;
        while(head != null){
            if(head.data>=data){
                break;
            }
        }
        DoublyLinkedListNode next = head;
        DoublyLinkedListNode prev = head.prev;
        DoublyLinkedListNode current = new DoublyLinkedListNode();
        current.data = data;
        next.prev = current;
        prev.next = current;
        current.prev = prev;
        current.next = next;
        return sol;

    }
}
