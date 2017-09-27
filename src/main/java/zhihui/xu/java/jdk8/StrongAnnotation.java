package zhihui.xu.java.jdk8;

import java.lang.annotation.*;

/**
 * Created by zhihui.xu on 2017/9/27.
 */
public class StrongAnnotation {
    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Filters {
        Filter[] value();
    }

    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    @Repeatable(Filters.class) //只是编译器层面的处理，对于底层没有任何变化
    public @interface Filter {
        String value();
    }


    @Filter("filter1")
    @Filter("filter2")
    public interface Filterable {
    }

    public static void main(String[] args) {
        for (Filter filter : Filterable.class.getAnnotationsByType(Filter.class)) {
            System.out.println(filter.value());
        }
    }
}
