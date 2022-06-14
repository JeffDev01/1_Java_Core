package basic.Vdatas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAjustersTest01 {


    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        now = now.plusDays(20);
        now = now.withDayOfMonth(20);//aqui troca só o dia do mês;
        now = now.with(ChronoField.DAY_OF_MONTH, 20);
        System.out.println(now);//Se fizer assim vai virar o mes
        System.out.println(now.getDayOfWeek());
        /*Se nao quisermos virar o mes podemos usar TemporalAjuster*/

        now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());


    }
}
