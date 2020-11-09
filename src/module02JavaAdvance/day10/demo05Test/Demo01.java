package module02JavaAdvance.day10.demo05Test;

import com.sun.source.tree.WhileLoopTree;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        Map<String, String> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("c.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            String[] arr = line.split("\\.");
            map.put(arr[0],arr[1]);
        }
        for (String key : map.keySet()) {
            bw.write(key+"."+map.get(key));
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
