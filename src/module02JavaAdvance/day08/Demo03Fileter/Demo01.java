package module02JavaAdvance.day08.Demo03Fileter;

import java.io.File;

public class Demo01 {
    public static void main(String[] args) {
        File f1 = new File("/Users/kala/IdeaProjects/ItHeiMa/");
        getAllFile(f1);
    }

    public static void getAllFile(File dir) {
        File[] files = dir.listFiles(new FileFilterImpl());
        for (File file : files) {
            if (file.isDirectory()) getAllFile(file);
            else System.out.println(file);
        }
    }
}
