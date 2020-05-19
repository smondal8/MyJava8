package J8;

import java.security.cert.CollectionCertStoreParameters;
import java.util.Collections;
import java.util.stream.IntStream;

public class factorial {
    public static int factorial(int i){
        if(i==0||i==1){
            return 1;
        }
        else{
            return IntStream.rangeClosed(2,i).reduce(1,(x, y)->x*y);
        }
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
