package module02JavaAdvance.day10.demo03CopyFile;

import java.io.*;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();

        FileInputStream fis = new FileInputStream("DS & Algorithms by Weiss.pdf");
        FileOutputStream fos = new FileOutputStream("a.pdf");
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        bis.close();
        bos.close();
        long e = System.currentTimeMillis();
        System.out.println(e-s);
    }
}
