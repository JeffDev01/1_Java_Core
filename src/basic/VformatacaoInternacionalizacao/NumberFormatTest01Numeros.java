package basic.VformatacaoInternacionalizacao;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01Numeros {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localePT = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] nf = new NumberFormat[4];
        nf[0] = NumberFormat.getInstance();
        nf[1] = NumberFormat.getInstance(localePT);
        nf[2] = NumberFormat.getInstance(localeJP);
        nf[3] = NumberFormat.getInstance(localeIT);

        double valor = 10_000.2130;
        for(NumberFormat numberFormat : nf){
            System.out.println(numberFormat.format(valor));
        }

    }


}
