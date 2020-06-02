package Algorithm;

import java.util.Arrays;
import java.util.Collections;

//https://www.hackerrank.com/challenges/two-arrays/problem
public class twoArrayProblem {
    static String twoArrays(int k, int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        String result = "YES";
        for(int i=0,j=B.length;i<A.length && j>0;i++,j--){
            if(A[i]+B[j]>=k){
                continue;
            }
            else{
                result = "NO";
            }
        }
        return result;
    }
}
