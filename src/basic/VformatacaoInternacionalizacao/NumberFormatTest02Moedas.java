package basic.VformatacaoInternacionalizacao;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest02Moedas {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localePT = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] nf = new NumberFormat[4];
        nf[0] = NumberFormat.getCurrencyInstance();
        nf[1] = NumberFormat.getCurrencyInstance(localePT);
        nf[2] = NumberFormat.getCurrencyInstance(localeJP);
        nf[3] = NumberFormat.getCurrencyInstance(localeIT);

        double valor = 1_000.2130;
        for(NumberFormat numberFormat : nf){
            System.out.println(numberFormat.getMaximumFractionDigits()); //Mostra a quantidade de digitos fracionados
            numberFormat.setMaximumFractionDigits(1);//posso setar o numero de digitos fracionados
            System.out.println(numberFormat.format(valor));
        }

    }
}
