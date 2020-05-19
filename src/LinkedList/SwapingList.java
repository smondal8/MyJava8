package LinkedList;

public class SwapingList {
    public static Node swapNodes(Node node){
        Node currentNode = node;
        while(currentNode != null && currentNode.getNext() != null){
            String temp = currentNode.getValue();
            currentNode.setValue(currentNode.getNext().getValue());
            currentNode.getNext().setValue(temp);
            currentNode = currentNode.getNext().getNext();
        }
        return node;
    }

    public static void main(String[] args) {
        Node node = new Node("1",null);
        node.setNext(new Node("2",null));
        node.getNext().setNext(new Node("3",null));
        node.getNext().getNext().setNext(new Node("4",null));
        node.getNext().getNext().getNext().setNext(new Node("5",null));
        node.getNext().getNext().getNext().getNext().setNext(new Node("6",null));
        node.printAll();
        System.out.println("Swapping the numbers :");
        Node node1 = SwapingList.swapNodes(node);
        node1.printAll();
    }
}
