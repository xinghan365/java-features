package zhihui.xu.java.jdk8;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

/**
 * Created by zhihui.xu on 2017/9/27.
 */
public class Nashorn {
    public static void main(String[] args) throws Exception {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");

        System.out.println(engine.getClass().getName());
        System.out.println("Result:" + engine.eval("function f() { return 1; }; f() + 1;"));
    }
}
