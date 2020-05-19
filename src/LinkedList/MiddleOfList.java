package LinkedList;

public class MiddleOfList {
    public static void main(String[] args) {
        Node N1 = new Node("1",new Node("2",new Node("3",new Node("4",new Node("5",null)))));
        N1.printAll();
        System.out.println("Middle element is ->");
        N1 = findMidElement(N1);
        System.out.println("Middle node is :"+N1.getValue());
    }

    private static Node findMidElement(Node n1) {
        Node fastpointer = null;
        Node slowPointer = null;
        if(n1.next == null){
            return n1;
        }
        else{
            fastpointer = slowPointer = n1;
            while(fastpointer != null && fastpointer.getNext() != null){
                fastpointer = fastpointer.getNext().getNext();
                slowPointer = slowPointer.getNext();
            }
            return slowPointer;
        }
    }
}
