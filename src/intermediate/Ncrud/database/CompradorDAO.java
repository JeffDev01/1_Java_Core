package intermediate.Ncrud.database;


import intermediate.Ncrud.classes.Comprador;
import intermediate.Ncrud.conexao.ConexaoFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CompradorDAO {

    public static void save(Comprador comprador) {
        String sql = "INSERT INTO `agencia`.`comprador` (`nome`, `cpf`) VALUES (? , ?);";
            try (Connection connection = ConexaoFactory.getConexao();
                 PreparedStatement ps = connection.prepareStatement(sql)) {

                ps.setString(1, comprador.getNome());
                ps.setString(2, comprador.getCpf());
                ps.executeUpdate();
                System.out.println("Registro inserido com sucesso.");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }


    public static void deletar(Integer id) {
        String sql = "DELETE FROM `agencia`.`comprador` WHERE (`id` = ?);";

        try (Connection connection = ConexaoFactory.getConexao();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Registro deletado com sucesso.");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void update(Comprador comprador) {
        String sql = "UPDATE `agencia`.`comprador` SET `nome` = ?, `cpf` = ? WHERE `id` = ?;";

        try (Connection connection = ConexaoFactory.getConexao();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1, comprador.getNome());
            ps.setString(2, comprador.getCpf());
            ps.setInt(3, comprador.getId());
            ps.executeUpdate();

            System.out.println("Update no registro realizado com sucesso.");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static List<Comprador> selectAll() {
        String sql = "SELECT * FROM agencia.comprador;";
        List<Comprador> compradorList = new ArrayList<>();

        try (Connection connection = ConexaoFactory.getConexao();
             PreparedStatement ps = connection.prepareStatement(sql);
             ResultSet rs = ps.executeQuery();) {

            while (rs.next()) {
                compradorList.add(new Comprador(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf")));
            }
            return compradorList;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }


    public static List<Comprador> seachByName(String nome) {
        String sql = "SELECT id, nome, cpf FROM agencia.comprador where nome LIKE ?;";

        List<Comprador> compradorList = new ArrayList<>();

        try (Connection connection = ConexaoFactory.getConexao();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1, "%" + nome + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                compradorList.add(new Comprador(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf")));
            }
            ConexaoFactory.close(connection, ps, rs);
            return compradorList;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public static Comprador seachById(Integer id) {
        String sql = "SELECT id, nome, cpf FROM agencia.comprador where id LIKE ?;";

        Comprador comprador = null;

        try (Connection connection = ConexaoFactory.getConexao();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                comprador = new Comprador(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf"));
            }
            ConexaoFactory.close(connection, ps, rs);
            return comprador;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

}




