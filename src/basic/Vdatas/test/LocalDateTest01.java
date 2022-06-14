package basic.Vdatas.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class LocalDateTest01 {

    public static void main(String[] args) {

        /*LocalDate classe que trabalha apenas com datas*/
        LocalDate date = LocalDate.of(2022, Month.JANUARY, 27);
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.isLeapYear());
        System.out.println(date.get(ChronoField.YEAR));

        LocalDate agora = LocalDate.now();
        System.out.println(agora);//Já salva no formato de banco de dados.
        System.out.println("----------------");

        LocalDate getAnoAtual  = LocalDate.now();
        Integer anoAtual = getAnoAtual.getYear();
        LocalDate inicioDoAno = LocalDate.of(anoAtual, Month.JANUARY, 1);
        System.out.println(inicioDoAno);

    }
}
