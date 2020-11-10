package module02JavaAdvance.day10.demo07ObjectStream;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Demo03Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Person> list = new ArrayList<>();
        list.add(new Person(1,"a"));
        list.add(new Person(2,"b"));
        list.add(new Person(3,"c"));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/module02JavaAdvance/day10/person.txt"));
        oos.writeObject(list);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/module02JavaAdvance/day10/person.txt"));
        ArrayList<Person> ans = (ArrayList<Person>) ois.readObject();
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i).toString());
        }
        ois.close();
        oos.close();
    }
}
