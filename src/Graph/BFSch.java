package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class BFSch {
    ArrayList<Integer> adjacencylist[];
    int numberOfVertices;

    public BFSch(int numberOfVertices) {
        this.numberOfVertices = numberOfVertices;
        adjacencylist = new ArrayList[numberOfVertices];
        for(int i=0;i<numberOfVertices;i++){
            adjacencylist[i] = new ArrayList<>();
        }
    }

    private void BFSUtil(int i) {
        boolean visited[] = new boolean[numberOfVertices];
        LinkedList<Integer> queue = new LinkedList<>();
        visited[i] = true;
        queue.add(i);
        while(!queue.isEmpty()){
            Integer item = queue.poll();
            System.out.println(item);
            ListIterator<Integer> itemIterator = adjacencylist[item].listIterator();
            while(itemIterator.hasNext()){
                Integer nextItem = itemIterator.next();
                if (!visited[nextItem]) {
                    visited[nextItem] = true;
                    queue.add(nextItem);
                }
            }
        }
    }

    private void addEdge(int i, int j) {
        adjacencylist[i].add(j);
    }

    public static void main(String[] args) {
        BFSch bfs = new BFSch(4);
        bfs.addEdge(0,1);
        bfs.addEdge(0,2);
        bfs.addEdge(1,2);
        bfs.addEdge(2,3);
        bfs.addEdge(3,3);
        bfs.addEdge(2,0);
        bfs.BFSUtil(2);
    }
}
