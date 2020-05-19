package Tree;

public class CousinTest {
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

    private static boolean cousinTest(Node myTree, int node1, int node2) {
        Integer node1Level = CompareLevel(myTree,node1,1);
        Integer node2Level = CompareLevel(myTree,node2,1);
        boolean result = false;
        if(node1Level == node2Level){
            result = compareRelationship(myTree,node1,node2);
        }
        return result;
    }

    private static boolean compareRelationship(Node myTree, int node1, int node2) {
        if(myTree.left == null || myTree.right == null){
            return true;
        }
        else if((myTree.left.value == node1 && myTree.right.value == node2)||(myTree.left.value == node2 && myTree.right.value == node1)){
            return false;
        }
        else{
            return compareRelationship(myTree.left,node1,node2)||compareRelationship(myTree.right
            ,node1,node2);
        }

    }

    private static Integer CompareLevel(Node myTree, int node1 , int level) {
        if(myTree == null){
            return null;
        }
        if(myTree.value == node1){
            return level;
        }
        else{
            Integer returnValue1 = CompareLevel(myTree.right,node1,level+1);
            Integer returnValue2 = CompareLevel(myTree.left,node1,level+1);
            if(returnValue1 != null)   {
                return returnValue1;
            }
            else{
                return returnValue2;
            }
        }
    }


    /*
     if ((myTree.left.value == node1 && myTree.right.value == node2) ||
                    (myTree.left.value == node2 && myTree.right.value == node1)) {
                return true;
            } else {
                CompareLevel(myTree.left, node1, node2);       
            }
     */
}
