package module02JavaAdvance.day10.demo04ReaderWriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo02Reader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("b.txt"));

        String s = br.readLine();
        System.out.println(s);
    }
}
