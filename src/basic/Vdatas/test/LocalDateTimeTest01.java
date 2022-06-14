package basic.Vdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();/*Agora tenho a data e hora do sistema*/
        LocalDate date = LocalDate.of(2022, Month.AUGUST, 6);
        LocalDate dateString = LocalDate.parse("2022-08-06");
        LocalTime time = LocalTime.of(9, 45, 00);
        System.out.println(localDateTime);
        System.out.println(date);
        System.out.println(time);
        LocalDateTime ldt1 = date.atTime(time);
        System.out.println(ldt1);


    }
}
