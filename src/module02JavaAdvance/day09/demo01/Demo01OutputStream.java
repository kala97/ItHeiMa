package module02JavaAdvance.day09.demo01;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("/Users/kala/IdeaProjects/a.txt");
        fos.write(97);
        fos.close();
    }
}
