package Algorithm;

import java.util.Arrays;

public class Segregation0n1 {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,0,1,0,0,0,1};
        int start = 0;
        int end = arr.length-1;
        while(start<end) {
            if (arr[start] == 1 && arr[end] == 0) {
                int tmp = arr[start];
                arr[start] = arr[end];
                arr[end] = tmp;
                start++;
                end--;
            }
            else if(arr[start] == 1){
                end--;
            }
            else if(arr[end] == 0){
                start++;
            }
            else{
                start++;
                end--;
            }
        }
        Arrays.stream(arr).forEach(System.out::print);
    }
}
