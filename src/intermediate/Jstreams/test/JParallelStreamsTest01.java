package intermediate.Jstreams.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class JParallelStreamsTest01 {



    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Runtime.getRuntime().availableProcessors());

        long num = 10_000_000;

        sumFor(num);
        sumStreamIterate(num);
        sumParallelStreamsIterate(num);
        sumLongStreamRangedClosed(num);
        sumParallelLongStreamRangedClosed(num);


    }

    private static void sumFor(long num){
        System.out.print("sum_For: ");
        long result =0;
        long init = System.currentTimeMillis();
        for(int i =1; i<=num; i++){
            result+=i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result+" Duration: "+(end-init)+"ms");
    }

    private static void sumStreamIterate(long num){
        System.out.print("sum_StreamIterate: ");
        long init = System.currentTimeMillis();

        long result= Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);

        long end = System.currentTimeMillis();
        System.out.println(result+" Duration: "+(end-init)+"ms");
    }

    private static void sumParallelStreamsIterate(long num){
        System.out.print("sum_ParallelStreamIterate: ");
        long init = System.currentTimeMillis();

        long result= Stream.iterate(1L, i -> i + 1).parallel().limit(num).reduce(0L, Long::sum);

        long end = System.currentTimeMillis();
        System.out.println(result+" Duration: "+(end-init)+"ms");
    }

    /*COMO PARALLELSTREAM FUNCIONA: SE TEMOS [1,2,3,4,5,6,7,8,9,10] por exemplo e queremos somar esses números
    * se temos 4 nucleos de processamento, o java irá dividir as tarefas para 4 threads em paralelo, por exemplo
    * 1 (1-3)
    * 2 (4-6)
    * 3 (7-8)
    * 4 (9-10)
    * Entretando nao tem como controlar o que acontece, e temos que ter o mesmo fonte de dados
    * Mas como nos exemplos aqui o PARALLEL nem sempre tras resultados interessantes pois nesse caso as threads não
    * sabem o range dos numeros e ficam perdidas, e isso consome toda capacidade do processador*/

    /*COMO MELHORAR O TEMPO DE PROCESSAMENTO
    * 1° Evitar Wrapping and Unwrapping, isso consome muito processamento
    * 2° Definir o range como rangeClosed*/

    private static void sumLongStreamRangedClosed(long num){
        System.out.print("sum_LongStreamRangedClosed: ");
        long init = System.currentTimeMillis();

        long result= LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);

        long end = System.currentTimeMillis();
        System.out.println(result+" Duration: "+(end-init)+"ms");
    }

    private static void sumParallelLongStreamRangedClosed(long num){
        System.out.print("sum_ParallelLongStreamRangedClosed: ");
        long init = System.currentTimeMillis();

        long result= LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);

        long end = System.currentTimeMillis();
        System.out.println(result+" Duration: "+(end-init)+"ms");
    }

}
