package intermediate.Ncrud.database;

import intermediate.Ncrud.classes.Carro;
import intermediate.Ncrud.classes.Comprador;
import intermediate.Ncrud.conexao.ConexaoFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarroDAO {
    public static void save(Carro carro) {
        String sql = "INSERT INTO `agencia`.`carro` (`nome`, `placa`, `compradorid`) VALUES (? , ?, ?);";
        try (Connection connection = ConexaoFactory.getConexao();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1, carro.getNome());
            ps.setString(2, carro.getPlaca());
            ps.setInt(3, carro.getComprador().getId());
            ps.executeUpdate();
            System.out.println("Registro inserido com sucesso.");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


    public static void deletar(Integer id) {
        String sql = "DELETE FROM `agencia`.`carro` WHERE (`id` = ?);";

        try (Connection connection = ConexaoFactory.getConexao();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Registro deletado com sucesso.");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void update(Carro carro) {
        String sql = "UPDATE `agencia`.`carro` SET `nome` = ?, `placa` = ? WHERE `id` = ?;";

        try (Connection connection = ConexaoFactory.getConexao();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1, carro.getNome());
            ps.setString(2, carro.getPlaca());
            ps.setInt(3, carro.getId());
            ps.executeUpdate();

            System.out.println("Update no registro realizado com sucesso.");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static List<Carro> selectAll() {
        String sql = "SELECT * FROM agencia.carro;";
        List<Carro> carroList = new ArrayList<>();

        try (Connection connection = ConexaoFactory.getConexao();
             PreparedStatement ps = connection.prepareStatement(sql);
             ResultSet rs = ps.executeQuery();) {

            while (rs.next()) {
                Comprador comprador = CompradorDAO.seachById(rs.getInt("compradorid"));
                carroList.add(new Carro(rs.getInt("id"), rs.getString("nome"), rs.getString("placa"),comprador));
            }
            return carroList;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }


    public static List<Carro> seachByName(String nome) {
        String sql = "SELECT id, nome, placa FROM agencia.carro where nome LIKE ?;";

        List<Carro> carroList = new ArrayList<>();

        try (Connection connection = ConexaoFactory.getConexao();
             PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, "%" + nome + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Comprador comprador = CompradorDAO.seachById(rs.getInt("id"));
                carroList.add(new Carro(rs.getInt("id"), rs.getString("nome"), rs.getString("placa"), comprador));
            }
            ConexaoFactory.close(connection, ps, rs);
            return carroList;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

}
