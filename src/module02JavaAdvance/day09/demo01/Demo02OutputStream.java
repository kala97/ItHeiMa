package module02JavaAdvance.day09.demo01;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo02OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("/Users/kala/IdeaProjects/b.txt"),true);
        fos.write(new byte[] {49,48,48});
        byte[] bytes = {68,69,70,71,72,73};
        fos.write(bytes);
        fos.write(bytes,1,2);
//        byte[] bytes1 = "你好啊，你是谁？".getBytes();
//        fos.write(bytes1);
//        System.out.println(Arrays.toString(bytes1));
//        fos.write(bytes1,1,2);
        fos.close();
    }
}
