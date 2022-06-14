package basic.Aarrays;

public class ArraysForEach {
    public static void main(String[] args) {
        int[] numeros = new int[5];  //index vai de 0 a 4
        int[] numeros2 = {1, 2, 3, 4, 5}; //outra forma de inicializar a array
        int[] numeros3 = new int[]{1, 2, 3, 4, 5};

        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }

        for (int aux : numeros){  //sintax mais simples. a variavel tem que ser a mesma da array
            System.out.println(aux);
        }

    }


}
