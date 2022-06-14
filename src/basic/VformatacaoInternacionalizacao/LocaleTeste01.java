package basic.VformatacaoInternacionalizacao;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class LocaleTeste01 {
    public static void main(String[] args) {
        /*Classe local ajusta os formatos de data conforme a ISO dentro
         * de cada pais.*/
        Locale localeItaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH"); //local Suíça
        Locale localeIndia = new Locale("hi", "IN");//India;
        Locale localeJapao = new Locale("ja", "JP");//Japão;
        Locale localeHolanda = new Locale("nl", "NL");//Japão;
        Calendar calendar = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);
        System.out.println("Italia: "+df1.format(calendar.getTime()));
        System.out.println("Suíça: "+df2.format(calendar.getTime()));
        System.out.println("India: "+df3.format(calendar.getTime()));
        System.out.println("Japão: "+df4.format(calendar.getTime()));
        System.out.println("Holanda: "+df5.format(calendar.getTime()));

        System.out.println(localeItaly.getDisplayCountry());
        System.out.println(localeCH.getDisplayCountry());
        System.out.println(localeIndia.getDisplayCountry());
        System.out.println(localeHolanda.getDisplayCountry(localeJapao));//Aqui mostra o pais do locale com o formato loale escolhindo



    }


}
