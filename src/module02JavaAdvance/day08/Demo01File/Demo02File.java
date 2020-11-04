package module02JavaAdvance.day08.Demo01File;

import java.io.File;

public class Demo02File {
    public static void main(String[] args) {
        show01();
    }

    private static void show01() {
        File f1 = new File("/Users/kala/IdeaProjects/ItHeiMa/a.txt");
        System.out.println(f1);

        File f2 = new File("/Use rs/kala/IdeaProjects/ItHeiMa");
        System.out.println(f2);

        File f3 = new File("b.txt");
        System.out.println(f3);
    }
}
