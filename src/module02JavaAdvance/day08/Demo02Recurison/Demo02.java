package module02JavaAdvance.day08.Demo02Recurison;

public class Demo02 {
    public static void main(String[] args) {
        System.out.println(Recurison(5));
    }

    private static int Recurison(int i) {
        if (i == 1){
            return 1;
        }
        return i*Recurison(i-1);
    }

}
