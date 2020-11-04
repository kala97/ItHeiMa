package module02JavaAdvance.day08.Demo02Recurison;

import java.io.File;

public class Demo03 {
    public static void main(String[] args) {
        File f1 = new File("/Users/kala/IdeaProjects/ItHeiMa/");
        getAllFile(f1);
    }

    public static void getAllFile(File dir) {
        System.out.println(dir);
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isDirectory())getAllFile(file);
            else System.out.println(file);
        }
    }
}
