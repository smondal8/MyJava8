package Tree;

public class TopView {

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
        topView(myTree);
    }

    private static void topView(Node root) {
        if(root == null){
            return;
        }
        printLeft(root);
        printRight(root.right);
    }
    public static void printLeft(Node root){
        if(root == null){
            return;
        }
        printLeft(root.left);
        System.out.print(root.value+" ");
    }
    public static void printRight(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.value+" ");
        printRight(root.right);
    }
}
