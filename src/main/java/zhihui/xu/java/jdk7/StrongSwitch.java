package zhihui.xu.java.jdk7;

/**
 * Created by zhihui.xu on 2017/9/27.
 */
public class StrongSwitch {
    public static void main(String[] args) {
        String s = "quux";
        switch (s) {
            case "quux":
                System.out.println("1");
                break;
                // fall-through
            case "foo":
            case "bar":
                System.out.println("2");
                break;
            case "baz":
                System.out.println("3");
                break;
                // fall-through
            default:
                System.out.println("4");
                break;
        }
    }
}
