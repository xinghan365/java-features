package zhihui.xu.java.jdk7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by zhihui.xu on 2017/9/27.
 */
public class AutocloseResource {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "";
        try (BufferedReader br = new BufferedReader(null)) {
            //br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
