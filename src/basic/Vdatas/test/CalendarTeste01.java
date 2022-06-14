package basic.Vdatas.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTeste01 {
    public static void main(String[] args) {
        Calendar c= Calendar.getInstance();
        System.out.println(c);

        if(c.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingo é o primeiro dia da semanaa");
        }
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        //Adicionar dia no calendario
        c.add(Calendar.DAY_OF_MONTH, 2); //Somar assim ele vira o mes
        c.roll(Calendar.HOUR, 12);//Aqui se ele rodar o dia ele volta no mesmo dia
        Date date = c.getTime();
        System.out.println(date);




    }
}
