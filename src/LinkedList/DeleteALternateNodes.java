package LinkedList;

public class DeleteALternateNodes {
    static void deleteAlternate (Node1 head){
        Node1 currentNode = head;
        int current = 0;
        int next = 0;
        //best practise
        while(currentNode != null && currentNode.getNext() != null){
            current = currentNode.getValue();
            next = currentNode.getNext().getValue();
            currentNode.setNext(currentNode.getNext().getNext());
            currentNode = currentNode.getNext();
        }
    }

    public static void main(String[] args) {
        Node1 N1 = new Node1(991,new Node1(20,new Node1(1000,new Node1(19,new Node1(1001,null)))));
        N1.printAll();
        System.out.println("do the changes.. ");
        DeleteALternateNodes.deleteAlternate(N1);
        N1.printAll();
    }
}
