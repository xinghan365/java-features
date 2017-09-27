package zhihui.xu.java.jdk8;

import sun.plugin2.util.ParameterNames;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * Created by zhihui.xu on 2017/9/27.
 */
public class ParameterName {

    public static void main(String[] args) throws Exception {
        Method method = ParameterNames.class.getMethod("main", String[].class);
        for (Parameter parameter : method.getParameters()) {
            System.out.println(parameter.getName());
        }
    }
}
