package module02JavaAdvance.day08.Demo02Recurison;

import java.io.File;

public class Demo04 {
    public static void main(String[] args) {
        File f1 = new File("/Users/kala/IdeaProjects/ItHeiMa/");
        getAllFile(f1);
    }

    public static void getAllFile(File dir) {
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isDirectory())getAllFile(file);
            else {
//                String s = file.toString();
//                s = s.toLowerCase();
//                boolean b = s.endsWith(".java");
//                if (b){
//                    System.out.println(s);
//                }
                if (file.getName().toLowerCase().endsWith("java")){
                    System.out.println(file);
                }
            }
        }
    }
}
