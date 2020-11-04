package module02JavaAdvance.day08.Demo03Fileter;

import java.io.File;
import java.io.FileFilter;

public class FileFilterImpl implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        if (pathname.toString().toLowerCase().endsWith("java")||pathname.isDirectory()){
            return true;
        }
        return false;
    }
}
