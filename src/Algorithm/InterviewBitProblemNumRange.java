package Algorithm;

import java.util.Arrays;
//https://www.interviewbit.com/problems/numrange/
public class InterviewBitProblemNumRange {
        // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
        public int numRange(int[] A, int B, int C) {
            int start = 0;
            int offset = 1;
            int result = 0;
            int sum = 0;
            while(start < A.length){
                sum = A[start];
                while (offset < A.length){
                    if (sum+A[start+offset]<=C && sum+A[start+offset]>=B){
                        result++;
                        sum = sum+A[start+offset];
                        offset++;
                    }
                }
                start++;
            }
            return result;
        }

}
