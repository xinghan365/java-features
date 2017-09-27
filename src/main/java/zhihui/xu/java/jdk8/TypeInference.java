package zhihui.xu.java.jdk8;

/**
 * Created by zhihui.xu on 2017/9/27.
 */
public class TypeInference {

    public static class Value<T> {
        public static <T> T defaultValue() {
            return null;
        }

        public T getOrDefault(T value, T defaultValue) {
            return (value != null) ? value : defaultValue;
        }
    }


    public static void main(String[] args) {
        final Value<String> value = new Value<>();
        value.getOrDefault("22", Value.defaultValue());
    }
}
