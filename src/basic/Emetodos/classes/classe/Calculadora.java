package basic.Emetodos.classes.classe;

public class Calculadora {

    public void calcularDoisNumeros() {
        System.out.println(5 + 10);
    }

    public void subtrairDoisNumeros() {
        System.out.println(10 - 5);
    }

    public void multiplicaDoisNumeros(int numero1, int numero2) {
        System.out.println(numero1 * numero2);
    }

    public double divideDoidNumeros(double numero1, double numero2) {
        return  numero1 / numero2;

    }

    public void somaArray (int[] numero){
        int soma = 0;
        for(int num : numero){
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaNumeros(int... num){
        int somaTotal=0;
        for(int aux : num){
           somaTotal+=aux;

        }
        System.out.println("Soma: "+somaTotal);
    }

}
