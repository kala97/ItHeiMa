package module02JavaAdvance.day12.demo04Supplier;

import java.util.function.Supplier;

public class Demo02Test {
    public static int getNum(Supplier<Integer> num){
            return num.get();
    }

    public static void main(String[] args) {
        int arr[] = {1,2,44,55,66,3254,63,3,2,654334};
        System.out.println(getNum(()->{
            int max = arr[0];
            for (int i : arr) {
                if (i>max){
                    max = i;
                }
            }
            return max;
        }));
    }
}
