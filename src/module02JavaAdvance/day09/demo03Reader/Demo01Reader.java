package module02JavaAdvance.day09.demo03Reader;

import java.io.FileReader;
import java.io.IOException;

public class Demo01Reader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("/Users/kala/IdeaProjects/a.txt");
//        int len = 0;
//        while ((len = fr.read()) != -1) {
//            System.out.println((char) len);
//        }
        char[] chars = new char[1024];
        int len = 0;
        while ((len = fr.read(chars)) != -1) {
            System.out.println(chars);
            System.out.println(new String(chars));
        }
    }
}
