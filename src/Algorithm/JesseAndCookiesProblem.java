package Algorithm;

public class JesseAndCookiesProblem {
    static int cookies(int k, int[] A) {
        int last = A.length-1;
        int result = 0;
        for(int i=last+1/2-1;i>=0;i--)
            A=minHeapify(A,last+1,i);
        //minHeapify(A,last+1,last+1/2-1);
        //System.out.println("After first heapify");
        //for(int i=0;i<A.length;i++)
        //System.out.println(A[i]);
        while(A[0] < k){
            int first = A[0];
            A = swap(A,0,last);
            //System.out.println("Before second heapify");
            //for(int i=0;i<A.length;i++)
            //System.out.println(A[i]);
            last--;
            //for(int i=last/2;i>=0;i--)
            A = minHeapify(A,last+1,0);
            //System.out.println("After second heapify");
            //for(int i=0;i<A.length;i++)
            //System.out.println(A[i]);
            int second = A[0];
            //if(last < A.length-1)
            //return -1;
            A = swap(A,0,last);
            A[last] = first + 2 * A[last];
            //System.out.println("After swap heapify");
            //for(int i=0;i<A.length;i++)
            //System.out.println(A[i]);
            for(int i=last/2-1;i>=0;i--)
                A = minHeapify(A,last+1,i);
            //System.out.println("After last heapify");
            //for(int i=0;i<A.length;i++)
            //System.out.println(A[i]);
            result ++;
        }
        return result;
    }

    private static int[] minHeapify(int[] A, int length, int root) {
        int minimum = A[root];
        int minIndex = root;
        int left = root*2+1;
        int right = root*2+2;
        if(left < length && A[left] < minimum){
            minimum = A[left];
            minIndex = left;
        }
        if(right < length && A[right] < minimum){
            minimum = A[right];
            minIndex = right;
        }
        if(minimum != A[root]){
            A = swap(A,root,minIndex);
            minHeapify(A,length,minIndex);
        }
        return A;
    }

    private static int[] swap(int[] a, int i, int last) {
        int temp  = a[i];
        a[i] = a[last];
        a[last] = temp;
        return a;
    }
}
