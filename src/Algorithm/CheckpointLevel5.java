package Algorithm;

import java.lang.reflect.Array;
import java.util.Arrays;

//https://www.interviewbit.com/problems/longest-consecutive-sequence/

//1 2 3 4 5 98 100 101 102 103 104 289 290
public class CheckpointLevel5 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,100,101,102,103,104,105,33,34};
        System.out.println(longestConsecutive(arr));
    }
    public static int longestConsecutive(final int[] A) {
        if(A.length == 1){
            return 1;
        }
        int result = 0;
        int counting = 0;
        Arrays.sort(A);
        //for(int number : A){
        //System.out.print(number+" ");
        //}
        boolean prev = false;
        for(int i=0;i<A.length-1;i++){
            if(A[i]+1 == A[i+1] && !prev){
                prev = true;
                counting++;
            }
            else if(A[i]+1 == A[i+1] && prev){
                counting++;
            }
            else if(A[i] == A[i+1]){
                continue;
            }
            else if(A[i]+1 != A[i+1]){
                prev = false;
                //counting++;
                if(counting > result) {
                    result = counting;
                    counting = 0;
                }
                else{
                    counting =0;
                }
            }
        }
        if(counting > 0){
            if(counting > result) {
                return result;
            }
            return ++counting;
        }
        return result;
    }
}
