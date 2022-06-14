package basic.Vdatas.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {

        String dateFormato = "yyyyMMdd_HHmmss";
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormato);
        System.out.println(sdf.format(new Date()));




    }



}



