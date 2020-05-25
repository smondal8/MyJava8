package Tree;

public class MirrorTree {
    public static void inOrderTraversal(Node node){
        if(node == null){
            return;
        }
        inOrderTraversal(node.left);
        System.out.print(node.value+" ");
        inOrderTraversal(node.right);
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
        inOrderTraversal(myTree);
    }
}
