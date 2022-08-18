package Algorithm;

import java.util.ArrayList;
import java.util.Arrays;

class Edge implements Comparable<Edge>{
    int src;
    int dest;
    int weight;
    public int compareTo(Edge item){
        return this.weight - item.weight;
    }
}
class Subset {
    int parent;
    int rank;
}
class Solution
{
    //Function to find sum of weights of edges of the Minimum Spanning Tree.
    static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj)
    {
        int numberOfEdge = adj.size() * adj.get(0).size();
        Edge[] edges = new Edge[numberOfEdge];
        Subset[] subsets = new Subset[V];
        int result = 0;
        //init vertices
        for(int i=0;i<V;i++){
            subsets[i] = new Subset();
            subsets[i].parent = i;
            subsets[i].rank = 0;
        }

        //init Edges
        for(int i=0;i<V;i++){
            for(ArrayList<Integer> j : adj.get(i)){
                edges[i] = new Edge();
                edges[i].src = i;
                edges[i].dest = j.get(0);
                edges[i].weight = j.get(1);
            }
        }
        //sort edges
        System.out.println("+++++++++++");
        Arrays.sort(edges);
        //lets loop till vertices - 1
        for(int i=0;i<V-1;i++){
            Edge edge = edges[i];
            int x = findSet(subsets,edge.src);
            int y = findSet(subsets,edge.dest);
            if(x == y){
                //addition will form cycle so ignore
                continue;
            }
            else{//union
                result = result + edge.weight;

                if(subsets[x].rank<subsets[y].rank){
                    subsets[x].parent = y;
                    subsets[y].rank = subsets[y].rank +1;
                }
                else{
                    subsets[y].parent = x;
                    subsets[x].rank = subsets[x].rank + 1;
                }
            }
        }
        return result;
    }
    public static int findSet(Subset[] subsets,int x){
        if(subsets[x].parent == x){
            return x;
        }
        else{
            return findSet(subsets,subsets[x].parent);
        }
    }
}

