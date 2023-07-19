package Graph;

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

// User function Template for Java
class Cell{
    int x;
    int d;
    int getX(){
        return x;
    }
    int getD(){
        return d;
    }
    Cell(int x,int d){
        this.x = x;
        this.d = d;
    }
    Cell(int x){
        this.x = x;
        this.d = 0;
    }
}

class SnakeAndLadder{
    static int minThrow(int N, int arr[]){
        int[] board = new int[30];
        for(int i=0;i<30;i++){
            board[i] = -1;
        }
        for(int i=0;i<2*N;i=i+2){
            board[arr[i]-1] = arr[i+1]-1;
        }
        // for(int i=N/2+1;i<N-1;i=i+2){
        //     board[arr[i]-1] = arr[i+1]-1;
        // }
        Queue<Cell> q = new LinkedList<Cell>();
        q.add(new Cell(0,0));
        board[0] = 0;
        while(!q.isEmpty()){
            Cell cell =  q.poll();
            if(cell.getX() == 29){
                return cell.getD();
            }
            for(int i=1;i<=6;i++){
                if(cell.getX()+i >= 30 ){
                    continue;
                }
                if(board[cell.getX()+i] == -1){
                    q.add(new Cell(cell.getX()+i,cell.getD()+1));
                    board[cell.getX()+i] = 0;
                }
                else if(board[cell.getX()+i] == 0){
                    continue;
                }
                else{
                    int newItem = board[cell.getX()+i];
                    q.add(new Cell(newItem,cell.getD()+1));
                    board[newItem] = 0;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {3, 22, 5, 8, 11, 26, 20, 29,
                17, 4, 19, 7, 27, 1, 21, 9};
        System.out.println(SnakeAndLadder.minThrow(8,arr));
    }
}
