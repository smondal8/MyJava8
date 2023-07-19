package Dynamic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<int[]>();
        for(int[] interval : intervals){
            if(newInterval[1]<interval[0]){
                result.add(new int[]{newInterval[0],newInterval[1]});
                newInterval[0] = interval[0];
                newInterval[1] = interval[1];
            }
            else if(interval[1]<newInterval[0]){
                result.add(new int[]{interval[0],interval[1]});
            }
            else{
                newInterval[0] = Math.min(interval[0],newInterval[0]);
                newInterval[1] = Math.max(interval[1],newInterval[1]);
            }
        }
        result.add(newInterval);
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] newInterval = {4,8};
        System.out.println(new InsertInterval().insert(intervals,newInterval));
    }
}
