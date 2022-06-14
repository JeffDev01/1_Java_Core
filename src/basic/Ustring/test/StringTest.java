package basic.Ustring.test;

import java.util.Locale;

public class StringTest {

    public static void main(String[] args) {
        String nome = "Jefferson";
        nome = nome.concat(" Borges de Brito"); // nome += " Borges de Brito"
        System.out.println(nome);

        String teste = "Jefferson";
        String teste2 = "jefferson";
        String teste3 = "  0123456789   ";

        System.out.println(teste.charAt(0)); //Acha o char dada a posição da string
        System.out.println(teste2.equalsIgnoreCase(teste)); //Compara independente se tem maiuscula ou não
        System.out.println(teste2.length()); //Mostra o tamanho da array
        System.out.println(teste2.replace('f','y')); //Troca todas as char por uma indicada
        System.out.println(teste2.toUpperCase());
        System.out.println(teste2.toLowerCase());
        System.out.println(teste3.substring(0, 4)); //Monstra as chars de um indice a outro começando a partir da 1
        System.out.println(teste3.trim()); //Tira os espaços em branco do inicio e fim de uma string



    }


}
