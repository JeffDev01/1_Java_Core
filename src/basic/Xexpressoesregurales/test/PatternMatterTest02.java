package basic.Xexpressoesregurales.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatterTest02 {
    public static void main(String[] args) {

        /*METACARACTERES
        * \d = Todos os digitos
        * \D = Tudo que nao for digito
        * \s = Espaços em branco \t \n \f \r
        * \S = Todos os caracters excluindo os brancos
        * \w = a-zA-Z, digitos, _
        * \W = Tudo o que nao for incluso no \w
        * [] Determina um range de opções para achar
        * ?  Zero ou uma
        * *  Zero ou mais
        * +  Uma ou mais
        * {n,m} de n até m
        * () Metacaracter de agrupamento
        * |  Ou, o(v|c)o = ovo ou oco
        * $  Representa o fim da linha
        * .  Caracter coringa, 1.3 = 123 ou 133 ou 1#3 ou seja, ignora o que tem entre */

        //  "\\w*Test\\d{.java,\\s,$}"




        String regex = "\\w(ab)($|\\s)";
        String texto = "abaaba TTTab ab.rrr";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto: " + texto);
        System.out.println("Expressão: " + regex);
        System.out.println("Posições encontradas:");
        while (matcher.find()) {
            System.out.println(matcher.start() + " " +matcher.group());
        }


    }
}
