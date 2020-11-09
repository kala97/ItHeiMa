package module02JavaAdvance.day09.demo02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01CopyFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/Users/kala/IdeaProjects/a.txt");
        FileOutputStream fos = new FileOutputStream("/Users/kala/IdeaProjects/c.txt");
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes))!= -1){
            fos.write(bytes);
        }
        fos.close();
        fis.close();
    }
}
