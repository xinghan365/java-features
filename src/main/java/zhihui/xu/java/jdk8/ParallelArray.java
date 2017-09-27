package zhihui.xu.java.jdk8;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by zhihui.xu on 2017/9/27.
 */
public class ParallelArray {
    public static void main(String[] args) {
        long[] arrayOfLong = new long [ 20000 ];

        Arrays.parallelSetAll( arrayOfLong,
                index -> ThreadLocalRandom.current().nextInt( 1000000 ) );
        Arrays.stream( arrayOfLong ).limit( 10 ).forEach(
                i -> System.out.print( i + " " ) );
        System.out.println();

        Arrays.parallelSort( arrayOfLong );
        Arrays.stream( arrayOfLong ).limit( 10 ).forEach(
                i -> System.out.print( i + " " ) );
        System.out.println();
    }
}
