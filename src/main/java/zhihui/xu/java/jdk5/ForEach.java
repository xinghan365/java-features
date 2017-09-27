package zhihui.xu.java.jdk5;

import java.util.Arrays;
import java.util.List;

/**
 * Created by zhihui.xu on 2017/9/27.
 */
public class ForEach {

    public static void main(String[] args) {
        List datas = Arrays.asList(1, 2, 3, 4, 5);
        for (Object data : datas) {
            System.out.println(data);
        }
    }
}
