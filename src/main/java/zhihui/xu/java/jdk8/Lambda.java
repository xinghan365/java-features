package zhihui.xu.java.jdk8;

import java.util.Arrays;
import java.util.List;

/**
 * Created by zhihui.xu on 2017/9/27.
 */
public class Lambda {
    public static void main(String[] args) {
        List<Integer> is = Arrays.asList(1, 3, 4, 5, 6);
        is.forEach(i -> System.out.println(i));
        is.forEach((i) -> {
            System.out.println(i);
            System.out.println(i + 1);
        });
        is.sort((i1, i2)->i1.compareTo(i2));
    }
}
