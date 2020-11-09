package module02JavaAdvance.day09.demo01;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo03InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/Users/kala/IdeaProjects/a.txt");
//        int read = fis.read();
//        System.out.println(read);
//        read = fis.read();
//        System.out.println(read);
//        read = fis.read();
//        System.out.println(read);
        int len = 0;
        while (( len = fis.read())!=-1){
            System.out.println(len);
        }
        fis.close();
    }
}
