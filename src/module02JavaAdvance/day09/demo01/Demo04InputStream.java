package module02JavaAdvance.day09.demo01;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo04InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/Users/kala/IdeaProjects/b.txt");
        byte[] bytes = new byte[2];
        int len = 0;

//        System.out.println(Arrays.toString(bytes));
//        System.out.println(new String(bytes));
        while (len != -1) {
            len = fis.read(bytes);
            System.out.println(new String(bytes));
        }
        fis.close();
    }
}
