package module02JavaAdvance.day10.demo06ReverseStream;

import java.io.FileReader;
import java.io.IOException;

public class Demo01FileReader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("我是GBK格式的文本.txt");
        int len = 0;
        while ((len = fr.read()) != -1) {
            System.out.println((char)len);
        }
        fr.close();
    }
}
