package zhihui.xu.java.jdk9;

/**
 * Created by zhihui.xu on 2017/9/27.
 */
public class DiamondOperatorExtension {
    public static void main(String[] args) {
        FooClass<Integer> fc = new FooClass<>(1) { // anonymous inner class
        };

        FooClass<? extends Integer> fc0 = new FooClass<>(1) {
            // anonymous inner class
        };

        FooClass<?> fc1 = new FooClass<>(1) { // anonymous inner class
        };
    }
}
