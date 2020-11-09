package module02JavaAdvance.day10.demo01BufferedOutputStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01BufferedOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("a.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write("字节缓冲输出流".getBytes());
//        bos.flush();
//        bos.close();
        fos.close();
    }
}
