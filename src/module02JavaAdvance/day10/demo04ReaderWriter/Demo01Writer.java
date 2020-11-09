package module02JavaAdvance.day10.demo04ReaderWriter;

import java.io.*;

public class Demo01Writer {
    public static void main(String[] args) throws IOException {
        BufferedWriter bf = new BufferedWriter(new FileWriter("b.txt"));
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));

        int len = 0;
        while ((len = br.read())!=-1){
            bf.write(len);
            bf.newLine();
        }
        bf.close();
        br.close();
    }
}
