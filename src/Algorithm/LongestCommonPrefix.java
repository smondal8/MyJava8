package Algorithm;

import java.lang.instrument.ClassDefinition;
import java.util.Arrays;
import java.util.Collection;
import java.util.Stack;

//https://www.interviewbit.com/problems/longest-common-prefix/
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] A) {
        int sizeOfArray = A.length;
        Arrays.sort(A);
        int firstStringSize = A[0].length();
        int lastStringSize = A[sizeOfArray-1].length();
        StringBuilder result = new StringBuilder();
        for(int i=0,j=0;i<firstStringSize && j<lastStringSize;i++,j++){
            if(A[0].charAt(i)!=A[sizeOfArray-1].charAt(j)){
                break;
            }
            else{
                result.append(A[0].charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {

    }
}
