package basic.Emetodos.classes.classe;

public class Subtracao {


    public double subtrairDoisNumeros(double num1, double num2) {
        //tratamento de erro
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;

    }

    public String juntaPalavras(String word1, String word2, String word3) {
        return word1 + word2 + word3;
    }

    public void imprimirDivisao(double num1, double num2){
        if(num2!=0){
            System.out.println("Divisão com void: "+ num1/num2);
            return; //tem a mesma função do break
        }
        System.out.println("Não pode dividir um numero por zero.");
    }


}
