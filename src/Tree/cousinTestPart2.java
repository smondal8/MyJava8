package Tree;

public class cousinTestPart2 {
    public static void main(String[] args) {
        Node myTree = new Node(19,null,null);
        myTree.left = new Node(11,null,null);
        myTree.right = new Node(15,null,null);
        myTree.left.left = new Node(10,null,null);
        myTree.left.right = new Node(21,null,null);
        myTree.right.left = new Node(9,null,null);
        myTree.right.right = new Node(23,null,null);
        myTree.right.right.left = new Node(17,null,null);
        myTree.right.right.right = new Node(27,null,null);

        boolean result = cousinTest(myTree,9,10);
        System.out.println(result);
    }

    private static boolean cousinTest(Node myTree, int i, int j) {
        if(getLevel(myTree,i) == getLevel(myTree,j) && !isSibling(myTree,i,j)){
            return true;
        }
        else{
            return false;
        }
    }

    private static int getLevel(Node mytree,int i) {
        if(mytree == null){
            return 0;
        }
        if(mytree.value == i){
            return 1;
        }
        int llevel = getLevel(mytree.left,i);
        int rlevel = getLevel(mytree.right,i);
        return (llevel<rlevel)?++rlevel:++llevel;
    }

    private static boolean isSibling(Node mytree,int i,int j){
        if(mytree == null){
            return false;
        }
        if((mytree.right.value == i && mytree.left.value == j)||(mytree.left.value == i && mytree.right.value == j)||
                (isSibling(mytree.left,i,j)||(isSibling(mytree.right,i,j)))){
            return true;
        }
        return false;
    }
}
