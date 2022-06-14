package basic.Imodificadorestatico.classes;

public class Cliente {
    // 1 - Primeiro é alocado espaço na memoria para o objeto criado
    // 2 - Cada atributo de classe é criado e inicializado com seus valores default, ou valores explicitos
    // 3 - Bloco de inicialização é executado.
    // 4 - O construtor é executado.


    private static int[] parcelas;

    // BLOCO DE INICIALIZAÇÃO:
     static{
        parcelas = new int[100];
        for (int i = 1; i <= 100; i++) {
            parcelas[i - 1] = i;
        }
        System.out.println("Dentro do bloco de inicialização.");
//        for (int parcela : parcelas) {
//            System.out.print(parcela + " ");
//        }
    }

    public Cliente() {

    }

    public static int[] getParcelas() {
        return parcelas;
    }


}
