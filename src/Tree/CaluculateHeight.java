package Tree;

public class CaluculateHeight {
    static int calHeight(Node mytree){
        int height = 0;
        if(mytree == null){
            return 0;
        }
        else{
            int leftHeight = calHeight(mytree.left);
            int rightHeight = calHeight(mytree.right);
            height = (leftHeight>rightHeight)? ++leftHeight : ++rightHeight;
            return height;
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
        System.out.println("Height is :"+calHeight(myTree));
    }
}
