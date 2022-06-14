package basic.Aarrays;

public class Arrays2Strings {

    public static void main(String[] args) {

        String[] nomes = new String[3]; //Não pode mudar o tamanho da array uma vez criado. Então nao é tao utilizado assim.
        nomes[0]="Jefferson";
        nomes[1]="Carlos";
        nomes[2]="Marcelo";

        for(int i = 0;i<=2;i++){
            System.out.println(nomes[i]);
        }


    }

}
