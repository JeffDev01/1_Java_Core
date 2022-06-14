package intermediate.Qjdbc.test;

import intermediate.Qjdbc.classes.Comprador;
import intermediate.Qjdbc.database.CompradorDB;

public class TestConexao {
    public static void main(String[] args) {

        Comprador comprador = new Comprador(3, "Marina Lemos", "222.222.222-33");

//        CompradorDB.updateRowSet(comprador);
//        CompradorDB.buscaCompradorPorIDRowSet(7);
//        CompradorDB.updateRowSetCached(comprador);

        CompradorDB.saveTransaction();

    }


}
