package module02JavaAdvance.day10.demo07ObjectStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo01ObjectOutputStream {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/module02JavaAdvance/day10/person.txt"));
        oos.writeObject(new Person(18,"小美女"));
        oos.close();
    }
}
