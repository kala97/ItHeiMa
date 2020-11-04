package module02JavaAdvance.day08.Demo03Fileter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class Demo02 {
    public static void main(String[] args) {
        File f1 = new File("/Users/kala/IdeaProjects/ItHeiMa/");
        getAllFile(f1);
    }

    public static void getAllFile(File dir) {
//        File[] files = dir.listFiles(new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                return pathname.isDirectory()||pathname.getName().toLowerCase().endsWith(".java");
//            }
//        });
//        File[] files = dir.listFiles(new FilenameFilter() {
//            @Override
//            public boolean accept(File dir, String name) {
//                return new File(dir, name).isDirectory() ||name.toLowerCase().endsWith(".java");
//            }
//        });
        File[] files = dir.listFiles((File d, String name)->{
            return new File(d, name).isDirectory() ||name.toLowerCase().endsWith(".java");
        });

        for (File file : files) {
            if (file.isDirectory()) getAllFile(file);
            else System.out.println(file);
        }
    }
}
