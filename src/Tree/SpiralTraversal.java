package Tree;

public class SpiralTraversal {
    static void spiralTraversal(Node head){
       int height = calculateHeight(head);
       Boolean lTor = true;
       for(int i=1;i<=height;i++){
           printSprial(head,i,lTor);
           lTor = !lTor;
       }
    }

    private static void printSprial(Node head, int height, Boolean lTor) {
        if(head == null){
            return;
        }
        if(height == 1){
            System.out.print(head.value+"  ");
        }
        else{
            if (lTor) {
                printSprial(head.left, height - 1, lTor);
                printSprial(head.right, height - 1, lTor);
            } else {
                printSprial(head.right, height - 1, lTor);
                printSprial(head.left, height - 1, lTor);
            }
        }
    }

    static int calculateHeight(Node head){
        int height = 0;
        if(head == null){
            return 0;
        }
        int leftHeight = calculateHeight(head.left);
        int rightHeight = calculateHeight(head.right);
        height = (leftHeight>rightHeight)?++leftHeight:++rightHeight;
        return height;
    }
    public static void main(String[] args) {
        Node myTree = new Node(9,null,null);
        myTree.left = new Node(10,null,null);
        myTree.right = new Node(15,null,null);
        myTree.left.left = new Node(10,null,null);
        myTree.left.right = new Node(21,null,null);
        myTree.right.left = new Node(9,null,null);
        myTree.right.right = new Node(23,null,null);
        myTree.right.right.left = new Node(17,null,null);
        myTree.right.right.right = new Node(27,null,null);
        spiralTraversal(myTree);
    }
}
