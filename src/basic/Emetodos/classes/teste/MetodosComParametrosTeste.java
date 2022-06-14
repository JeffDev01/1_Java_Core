package basic.Emetodos.classes.teste;

import basic.Emetodos.classes.classe.MetodosComParametros;

public class MetodosComParametrosTeste {

    public static void main(String[] args) {

        MetodosComParametros calculo = new MetodosComParametros();
        MetodosComParametros nomes = new MetodosComParametros();

        nomes.juntarNomes("Jefferson", "Marcelo");

        double resultado = calculo.somaImposto(1000, 0.2);
        System.out.println("Salario final: "+resultado);


    }


}
