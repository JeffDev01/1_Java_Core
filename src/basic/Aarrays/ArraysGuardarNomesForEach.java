package basic.Aarrays;

public class ArraysGuardarNomesForEach {
    public static void main(String[] args) {

        String[] nomes = new String[4];
        nomes[0]="Jefferson";
        nomes[1]="Carlos";
        nomes[2]="Rodrigo";
        nomes[3]="João";

        for(String aux : nomes){
            System.out.println(aux);
        }

    }

}
