package module02JavaAdvance.day10.demo06ReverseStream;

import java.io.*;

public class Demo02 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("我是GBK格式的文本.txt"), "GBK");
        int len = 0;
        while ((len = isr.read())!=-1){
            System.out.println((char) len);
        }
    }
}
