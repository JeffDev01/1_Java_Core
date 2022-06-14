package basic.Emetodos.classes.teste;

import basic.Emetodos.classes.classe.Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {

        Calculadora cal = new Calculadora();

//        cal.calcularDoisNumeros();
//        cal.subtrairDoisNumeros();
//        System.out.println("Continua a execução do codigo.");
//        cal.multiplicaDoisNumeros(2, 6);
//        System.out.println("Divide dois numeros.");
//        double resultado = cal.divideDoidNumeros(20, 2);
//        System.out.println(resultado);

        int[] numeros = new int[]{1, 2, 3, 4, 5};

        cal.somaArray(numeros);

        cal.somaVarArgs(1,2,3,4,5,6,7,8,9,10);
        //usar VarArgs eu posso passar os valores diretos, sem necessidade de referencia a array
        //só posso ter um varArgs por assinatura.

        cal.somaNumeros(30,30,30,10);
    }
}
