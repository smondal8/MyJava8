package J8;

import java.security.cert.CollectionCertStoreParameters;
import java.util.Collections;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class factorial {
    public static int factorial(int i){
        if(i==0||i==1){
            return 1;
        }
        else{
            return IntStream.rangeClosed(2,i).reduce(1,(x, y)->x*y);
        }
    }
    public static int factorial2(int i){
        //return IntStream.rangeClosed(2,i).reduce(1,(x,y)->x*y);
        return Stream.iterate(1,n->n+1).limit(i).collect(Collectors.summingInt(Integer::valueOf));
    }
    public static void main(String[] args) {
        System.out.println(factorial2(5));
    }
}
