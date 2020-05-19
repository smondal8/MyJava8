package LinkedList;

public class Node {
    String Value;
    Node next;
    public Node(String value, Node next) {
        Value = value;
        this.next = next;
    }

    public String getValue() {
        return Value;
    }

    public Node getNext() {
        return next;
    }

    public void setValue(String value) {
        Value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    public void printAll(){
        Node node = this;
        while(node != null){
            System.out.println(node.getValue());
            node = node.getNext();
        }
    }
}
