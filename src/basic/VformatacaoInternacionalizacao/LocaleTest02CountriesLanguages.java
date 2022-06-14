package basic.VformatacaoInternacionalizacao;

import java.util.Locale;

public class LocaleTest02CountriesLanguages {

    public static void main(String[] args) {

        System.out.println(Locale.getDefault()); //lingua e pais default

        //LINGUAS E PAISES SUPORTADOS PELO JAVA
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();

        for(String isoLanguage : isoLanguages){
            System.out.print(isoLanguage+" ");
        }
        System.out.println();
        for(String isoCountry : isoCountries){
            System.out.print(isoCountry+" ");
        }



    }

}
