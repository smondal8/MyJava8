package Tree;

public class Traversal {
    //in-order
    static void traverseInOrder(Node head){
        if(head != null){
            traverseInOrder(head.left);
            System.out.print(head.value);
            System.out.print(",");
            traverseInOrder(head.right);

        }
    }
    static void traversePostOrder(Node head){
        if(head != null){
            traversePostOrder(head.left);
            traversePostOrder(head.right);
            System.out.print(head.value);
            System.out.print(",");
        }
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
        System.out.println("Inorder");
        traverseInOrder(myTree);
        System.out.println();
        System.out.println("post order");
        traversePostOrder(myTree);
        System.out.println();
        System.out.println("preorder");
        traversePreOrder(myTree);
        System.out.println();
        System.out.println("BFS");
        traverseBfs(myTree);
    }

    /**
     * this does BFS travarsal and prints nodes
     * @param myTree
     */
    private static void traverseBfs(Node myTree) {
        int height = calculateHeight(myTree);
        for(int i=1;i<=height;i++){
            printingTraversed(myTree,i);
        }
    }

    private static void printingTraversed(Node myTree, int i) {
        if(myTree == null){
            return ;
        }
        if(i==1){
            System.out.print(myTree.value+" ,");
        }
        else {
            printingTraversed(myTree.left, i-1);
            printingTraversed(myTree.right, i-1);
        }
    }

    /**
     * returns height of tree
     * @param tree
     * @return
     */
    private static int calculateHeight(Node tree){
        int lHeight = 0;
        int rHeight = 0;
        if(tree == null){
            return 0;
        }
        lHeight = calculateHeight(tree.left);
        rHeight = calculateHeight(tree.right);
        if(lHeight>rHeight) return ++lHeight;
        else return ++rHeight;
    }
    private static void traversePreOrder(Node head) {
        if(head != null){
            System.out.print(head.value);
            System.out.print(",");
            traversePreOrder(head.left);
            traversePreOrder(head.right);
        }
    }
}
