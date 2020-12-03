package module02JavaAdvance.day12.demo02Lambda;
//日志案例
public class Demo01Logger {
    public static void showLog(int level,String message){
        if (level == 1){
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        String mgs1 = "Hello";
        String mgs2 = "World";
        String mgs3 = "Java";

        showLog(1,mgs1+mgs2+mgs3);
    }
}
