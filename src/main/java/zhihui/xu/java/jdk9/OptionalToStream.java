package zhihui.xu.java.jdk9;

import java.util.Arrays;
import java.util.List;

/**
 * Created by zhihui.xu on 2017/9/27.
 */
public class OptionalToStream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1", "a", "b", "v");
       // List<String> filteredList = list.stream().flatMap(Optional::stream).collect(Collectors.toList());
    }
}
