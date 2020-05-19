package LinkedList;

public class Node1 {
    int Value;
    Node1 next;
    public Node1(int value, Node1 next) {
        Value = value;
        this.next = next;
    }

    public int getValue() {
        return Value;
    }

    public Node1 getNext() {
        return next;
    }

    public void setValue(int value) {
        Value = value;
    }

    public void setNext(Node1 next) {
        this.next = next;
    }
    public void printAll(){
        Node1 node = this;
        while(node != null){
            System.out.print(node.getValue()+" , ");
            node = node.getNext();
        }
        System.out.println("----------");
    }
}
