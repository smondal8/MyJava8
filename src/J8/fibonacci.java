package J8;

import java.util.stream.Stream;

public  class fibonacci {
    public static void fibonacciSeries(int n) {
        Stream.iterate(new int[]{0, 1}, x -> new int[]{x[1], x[0] + x[1]}).limit(n).
                forEach(s->System.out.println(s[0]));
    }

    public static void main(String[] args) {        fibonacciSeries(10);    }
}
