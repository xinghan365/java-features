package zhihui.xu.java.jdk9;

/**
 * Created by zhihui.xu on 2017/9/27.
 */
public interface InterfacePrivateMethod {
    private static String staticPrivate() {
        return "static private";
    }

    private String instancePrivate() {
        return "instance private";
    }

    default void check() {
        String result = staticPrivate();
        InterfacePrivateMethod pvt = new InterfacePrivateMethod() {
            // anonymous class
        };
        result = pvt.instancePrivate();
    }
}
