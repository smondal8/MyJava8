package Algorithm;

import java.util.Arrays;
//https://www.interviewbit.com/problems/numrange/
public class InterviewBitProblemNumRange {
        public int numRange(int[] A, int B, int C) {
            int start = 0;
            int offset = 1;
            int result = 0;
            int sum = 0;
            while(start < A.length-1){
                sum = A[start];
                offset = 1;
                while (offset+start < A.length){
                    if (sum+A[start+offset]<C && sum+A[start+offset]>B){
                        result++;
                        sum = sum+A[start+offset];
                    }
                    else if(sum+A[start+offset]>=C){
                        break;
                    }
                    else if(sum+A[start+offset]<B){
                        sum = sum+A[start+offset];
                    }
                    offset++;
                }
                start++;
            }
            return result;
        }

}
