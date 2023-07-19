package J8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public  class fibonacci {
    public static void fibonacciSeries(int n) {
//        Stream.iterate(new int[]{0, 1}, x -> new int[]{x[1], x[0] + x[1]}).limit(n).
//                forEach(s->System.out.println(s[0]));
        List<Integer> result = Stream.iterate(new int[]{0, 1}, x -> new int[]{x[1], x[0] + x[1]}).limit(n).map(x -> x[0]).collect(Collectors.toList());
        System.out.println(result);
    }

    public static void main(String[] args) {        fibonacciSeries(10);    }
}
