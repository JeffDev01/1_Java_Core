package intermediate.Rjdbc.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {


    public Connection getConexao() {

        String url = "jdbc:mysql://localhost:3306/agencia";
        String user = "root";
        String senha = "root";

        try {
            return DriverManager.getConnection(url, user, senha);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
