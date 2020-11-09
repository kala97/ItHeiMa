package module02JavaAdvance.day09.demo06Prop;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Demo01Properties {
    public static void main(String[] args) throws IOException {
//        show02();
        show03();
    }

    private static void show03() throws IOException {
        Properties prop = new Properties();
        prop.load(new FileReader("a.txt"));
        Set<String> set = prop.stringPropertyNames();
        for (String s : set) {
            System.out.println(s+"="+prop.getProperty(s));
        }
    }

    private static void show02() throws IOException {
        Properties prop = new Properties();
        prop.setProperty("1","a");
        prop.setProperty("2","b");
        prop.setProperty("3","c");
        FileWriter fw = new FileWriter("a.txt");
        prop.store(fw,"save data");
        fw.close();
    }
}
