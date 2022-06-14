package basic.Ustring.test;


public class StringPerformanceTest {
    public static void main(String[] args) {

        long inicio = System.currentTimeMillis();
        concatString(30000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto String: "+(fim-inicio)+"ms");

        long inicio2 = System.currentTimeMillis();
        concatStringBuilder(30000);
        long fim2 = System.currentTimeMillis();
        System.out.println("Tempo gasto StringBuilder: "+(fim2-inicio2)+"ms");

        long inicio3 = System.currentTimeMillis();
        concatStringBuffer(30000);
        long fim3 = System.currentTimeMillis();
        System.out.println("Tempo gasto StringBuffer: "+(fim3-inicio3)+"ms");


    }

    private static void concatString(int tam){
        String string = "";
        for(int i=0; i<tam; i++){
            string +=i;
        }
    }

    private static void concatStringBuilder(int tam){
        StringBuilder stringBuilder =  new StringBuilder(tam);
        for(int i=0; i<tam; i++){
            stringBuilder.append(i);
        }
    }

    private static void concatStringBuffer(int tam){
        StringBuffer stringBuffer =  new StringBuffer(tam);
        for(int i=0; i<tam; i++){
            stringBuffer.append(i);
        }
    }


}
