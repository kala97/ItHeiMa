package module02JavaAdvance.day12.Demo03LambdaTest;

import java.util.Arrays;
import java.util.Comparator;

public class Demo02Comparator {
    public static Comparator<String> getComparator() {
//        return (o1, o2) -> o2.length() - o1.length();
        return (o1, o2) -> o2.length() - o1.length();
    }

    public static void main(String[] args) {
        String[] arr = {"a","bb","ccc","dddd"};
        Arrays.sort(arr,getComparator());
        System.out.println(Arrays.toString(arr));
    }
}
