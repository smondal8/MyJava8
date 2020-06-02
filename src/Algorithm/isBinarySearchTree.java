package Algorithm;
//https://www.hackerrank.com/challenges/is-binary-search-tree/problem

class Node {
    int data;
    Node left;
    Node right;
}
public class isBinarySearchTree {
    boolean checkBST(Node root,int parentVal) {
        if(left(root,parentVal) && right(root,parentVal)){
            return true;
        }
        else{
            return false;
        }
    }
    boolean left(Node root,int parentVal){
        if(root == null){
            return true;
        }
        if(root.data > parentVal){
            return false;
        }
        if(root.left.data < root.data && checkBST(root.left,root.data)){
            return true;
        }
        else{
            return false;
        }
    }
    boolean right(Node root,int parentVal){
        if(root == null){
            return true;
        }
        if(root.data < parentVal){
            return false;
        }
        if(root.right.data > root.data && checkBST(root.right,root.data)){
            return true;
        }
        else{
            return false;
        }
        /*
        boolean left(Node root, int pdata) {
    if (root == null) return true;
    if (root.data >= pdata) return false;
    return left(root.left, root.data) &&
        left(root.left, pdata) &&
        left(root.right, pdata) &&
        right(root.right, root.data);
}

boolean right(Node root, int pdata) {
    if (root == null) return true;
    if (root.data <= pdata) return false;
    return right(root.right, root.data) &&
        right(root.right, pdata) &&
        right(root.left, pdata) &&
        left(root.left, root.data);
}

boolean checkBST(Node root) {
	return left(root.left, root.data) &&
    	right(root.right, root.data);
}
         */

    }
}
