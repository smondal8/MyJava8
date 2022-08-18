package Graph;

import java.util.ArrayList;
import java.util.ListIterator;

public class DFS {
    int NumberOfVertices;
    ArrayList<Integer> adjacencyList[];
    boolean visited[];
    public DFS(int i){
        this.NumberOfVertices = i;
        adjacencyList = new ArrayList[NumberOfVertices];
        for(int j=0;j<NumberOfVertices;j++){
            adjacencyList[j] = new ArrayList<>();
        }
        visited = new boolean[NumberOfVertices];
    }
    public void addEdges(int i,int j){
        adjacencyList[i].add(j);
    }

    public static void main(String[] args) {
        DFS dfs = new DFS(4);
        dfs.addEdges(0,1);
        dfs.addEdges(0,2);
        dfs.addEdges(1,2);
        dfs.addEdges(2,0);
        dfs.addEdges(2,3);
        dfs.addEdges(3,3);
        dfs.dfsUtil(2);
    }

    private void dfsUtil(int i) {
        dfsRecursion(i);
    }

    private void dfsRecursion(Integer item) {
//        1. if item is visited do not print
//            2. explore item
        visited[item] = true;
        System.out.println(item);
        ListIterator<Integer> items = adjacencyList[item].listIterator();
        while(items.hasNext()){
            Integer nextItem = items.next();
            if (!visited[nextItem]) {
                dfsRecursion(nextItem);
            }
        }
    }
}
