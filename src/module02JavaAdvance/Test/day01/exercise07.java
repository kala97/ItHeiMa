package module02JavaAdvance.Test.day01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class exercise07 {
    public static void main(String[] args) {
        Date now = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String datestr = df.format(now);
        System.out.println(datestr);
    }
}
