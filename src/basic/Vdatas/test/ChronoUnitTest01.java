package basic.Vdatas.test;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {


    LocalDateTime aniversario =LocalDateTime.of(2000,1,1, 1,1,1,1);
    LocalDateTime now = LocalDateTime.now();
        System.out.println(ChronoUnit.DAYS.between(aniversario,now));
        System.out.println(ChronoUnit.WEEKS.between(aniversario,now));
        System.out.println(ChronoUnit.MONTHS.between(aniversario,now));
        System.out.println(ChronoUnit.YEARS.between(aniversario,now));

    }


}
