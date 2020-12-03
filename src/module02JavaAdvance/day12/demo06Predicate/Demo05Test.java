package module02JavaAdvance.day12.demo06Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Demo05Test {
    public static ArrayList<String> test(String[] str, Predicate<String> pre1, Predicate<String> pre2){
        ArrayList<String> list = new ArrayList<>();
        for (String s : str) {
            boolean b = pre1.and(pre2).test(s);
            if (b) list.add(s);
        }
        return list;
    }

    public static void main(String[] args) {
        String[] s = {"迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男", "赵丽颖,女"};
        ArrayList<String> list = test(s, (str) -> "女".equals(str.split(",")[1]), str -> str.split(",")[0].length() == 4);
        for (String l : list) {
            System.out.println(l);
        }
    }
}
