package Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] dp = new int[triangle.size()+1];
        int col = 0;
        int min = Integer.MAX_VALUE;
        //for last row
        for(int i=0;i<triangle.size();i++){
            if(min>triangle.get(triangle.size()-1).get(i)){
                min = triangle.get(triangle.size()-1).get(i);
                col = i;
            }
        }
        dp[triangle.size()] = min;
        for(int i = triangle.size()-2;i>0;i--){
            if(col == 0){//first column
                min = triangle.get(i).get(col);
                col = col;
                dp[i+1] = min+dp[i+2];
            }
            else if(col == i){//last column
                min = triangle.get(i).get(col-1);
                col = col-1;
                dp[i+1] = min+dp[i+2];
            }
            else{
                if(triangle.get(i).get(col-1) < triangle.get(i).get(col)){
                    min = triangle.get(i).get(col-1);
                    col = col-1;
                    dp[i+1] = min+dp[i+2];
                }else{
                    min = triangle.get(i).get(col);
                    col = col;
                    dp[i+1] = min+dp[i+2];
                }
            }
        }
        return dp[2]+triangle.get(0).get(0);
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        List<List<Integer>> input = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list1 = Arrays.asList(2);
        input.add(list1);

        List<Integer> list2 = new ArrayList<>();
        list2 = Arrays.asList(3,4);
        input.add(list2);

        List<Integer> list3 = new ArrayList<>();
        list3 = Arrays.asList(6,5,7);
        input.add(list3);

        List<Integer> list4 = new ArrayList<>();
        list4 = Arrays.asList(4,1,8,3);
        input.add(list4);

        System.out.println(triangle.minimumTotal(input));
    }
}
