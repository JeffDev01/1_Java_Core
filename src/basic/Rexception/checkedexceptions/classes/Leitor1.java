package basic.Rexception.checkedexceptions.classes;

public class Leitor1 implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("Fechado Leitor 1");

    }
}
