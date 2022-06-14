package basic.Xexpressoesregurales.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatterTest01 {
    public static void main(String[] args) {

//        /*Regex é usado para validação de dados e pesquisas*/
//        String regex ="ab";
//        String texto = "abaaba";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher  matcher = pattern.matcher(texto);
//        System.out.println("Texto: "+texto);
//        System.out.println("Expressão: "+regex);
//        System.out.println("Posições encontradas:");
//        while(matcher.find()){
//            System.out.print(matcher.start()+" ");
//        }


        String totalToPay = "1000,00";
        String replace = totalToPay.replace(",", ".");
        System.out.println(replace);

    }
}



