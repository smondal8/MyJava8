package LinkedList;

class ReverseLinkedList {
    public static Node reverseListRecursive(Node node , Node prev){
        if(node.getNext()== null){
            node.setNext(prev);
            return node;
        }
        else{
            Node next = node.getNext();
            node.setNext(prev);
            return reverseListRecursive(next, node);
        }
    }
    public static Node reverseListIteratively(Node node){
        //initialize all pointers
        Node currentNode = node;
        Node prev = null;
        Node next = null;
        while (currentNode != null) {
                //take the backup of next
                next = currentNode.getNext();
                //do the real thing : reversal of the pointer
                currentNode.setNext(prev);
                //hold the prev and forward current pointer
                prev = currentNode;
                currentNode = next;
        }
        return prev;
    }
    public static void main (String[] args){
        Node N1 = new Node("1",new Node("2",new Node("3",null)));
        N1.printAll();
        System.out.println("Lets reverse .. ");
        Node newNode = ReverseLinkedList.reverseListRecursive(N1, null);
        newNode.printAll();
    }
}

