package basic.Vdatas.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(23, 32, 12);
        System.out.println(time);

        LocalTime nowTime= LocalTime.now();
        System.out.println(nowTime);
        System.out.println(nowTime.getMinute());
        System.out.println(nowTime.getHour());
        System.out.println(nowTime.getSecond());
        System.out.println(nowTime.getNano());
        System.out.println(nowTime.get(ChronoField.CLOCK_HOUR_OF_DAY));
        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.MIN);


    }


}
