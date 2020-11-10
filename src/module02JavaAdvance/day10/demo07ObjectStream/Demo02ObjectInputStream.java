package module02JavaAdvance.day10.demo07ObjectStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo02ObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/module02JavaAdvance/day10/person.txt"));
        Object o = ois.readObject();
        ois.close();
        System.out.println(o);
    }
}
