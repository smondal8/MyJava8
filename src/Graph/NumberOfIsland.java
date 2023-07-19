package Graph;

public class NumberOfIsland {
    public int findCircleNum(int[][] isConnected) {
        int result = 0;
        boolean[] Visited = new boolean[isConnected.length];
        for(int i=0;i<isConnected.length;i++){
            if(!Visited[i]){
                result++;
                dfsUtil(result,Visited,isConnected,0);
            }
        }
        return result;
    }
    void dfsUtil(int result,boolean[] Visited,int[][] isConnected,int node){
        if(Visited[node]){
            return;
        }
        Visited[node] = true;
        for(Integer item: isConnected[node]){
            if(item == 1){
                dfsUtil(result,Visited,isConnected,item);
            }
        }
    }

    public static void main(String[] args) {
        int[][] input = {{1,0,0},{0,1,0},{0,0,1}};
        System.out.println(new NumberOfIsland().findCircleNum(input));
    }
}
