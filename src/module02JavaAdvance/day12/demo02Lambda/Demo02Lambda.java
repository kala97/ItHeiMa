package module02JavaAdvance.day12.demo02Lambda;

public class Demo02Lambda {
    public static void showLog(int level, MessageBuilder mb) {
        if (level == 1) {
            System.out.println(mb.builderMessage());
        }
    }

    public static void main(String[] args) {
        String mgs1 = "Hello";
        String mgs2 = "World";
        String mgs3 = "Java";

        showLog(1, () -> mgs1 + mgs2 + mgs3);
    }
}
