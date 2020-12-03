package module02JavaAdvance.day12.demo05Consumer;

import java.util.function.Consumer;

public class Demo03Test {
    public static void printInfo(String[] arr, Consumer<String> con1,Consumer<String> con2){
        for (String s : arr) {
            con1.andThen(con2).accept(s);
        }
    }

    public static void main(String[] args) {
        String[] arr = {"古力娜扎，女","迪丽热巴，女","马尔扎哈，男"};
        printInfo(arr,(t)->{
            String name = t.split("，")[0];
            System.out.print("姓名:"+name);
        },(t)->{
            String age = t.split("，")[1];
            System.out.println("，年龄:"+age+"。");
        });
    }
}
