package LinkedList;

public class LinkedListDetectCycle {
    public static void main(String[] args) {
        Node N1 = new Node("1",null);
        N1.setNext(new Node("2",null));
        N1.getNext().setNext(new Node("3",null));
        N1.getNext().getNext().setNext(new Node("4",null));
        N1.getNext().getNext().getNext().setNext(new Node("5",null));
        N1.getNext().getNext().getNext().getNext().setNext(new Node("6",null));
        N1.getNext().getNext().getNext().getNext().getNext().setNext(N1);
        //N1.printAll();
        Boolean result = true;
        System.out.println(detectCycle(N1));
    }
    public static Boolean detectCycle(Node node){
        Node fastPointer;
        Node slowPointer;
        fastPointer = slowPointer = node;
        Boolean result = false;
        while(fastPointer != null && fastPointer.getNext()!=null){
            fastPointer = fastPointer.getNext().getNext();
            slowPointer = slowPointer.getNext();
            if(fastPointer == slowPointer){
                return true;
            }
        }
        return false;
    }
}
