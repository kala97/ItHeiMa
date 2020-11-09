package module02JavaAdvance.day10.demo06ReverseStream;

import java.io.*;

public class Demo03GBKtoUTF8 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("src/module02JavaAdvance/day10/我是GBK格式的文本.txt"), "GBK");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("src/module02JavaAdvance/day10/我是UTF-8格式的文本.txt"), "UTF-8");
        int len = 0;
        while ((len = isr.read()) != -1) {
            osw.write(len);
        }
        osw.close();
        isr.close();
    }
}
