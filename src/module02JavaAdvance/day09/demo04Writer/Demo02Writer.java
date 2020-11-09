package module02JavaAdvance.day09.demo04Writer;

import java.io.FileWriter;
import java.io.IOException;

public class Demo02Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("a.txt",false);
        char[] chars = {'a','b','c','d','e','f'};
        String s = "abcdefghijklmn";
        fw.write(chars);
        fw.write("\r\n");
        fw.write(chars,2,3);
        fw.write("\r\n");
        fw.write(s);
        fw.write("\r\n");
        fw.write(s,2,10);
        fw.write("\r\n");
        fw.close();
    }
}
