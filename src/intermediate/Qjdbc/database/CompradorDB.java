package intermediate.Qjdbc.database;


import intermediate.Qjdbc.classes.Comprador;
import intermediate.Qjdbc.classes.MyRowSetListener;
import intermediate.Qjdbc.conexao.ConexaoFactory;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CompradorDB {

    public static void inserirCompradorBD(Comprador comprador) {
        String slq = "INSERT INTO `agencia`.`comprador` (`nome`, `cpf`) VALUES ('" + comprador.getNome() + "', '" + comprador.getCpf() + "');";
        Connection connection = ConexaoFactory.getConexao();
        if (connection != null) {
            try {
                Statement stmt = connection.createStatement(); /*A Statement recebe a conexão e cria um objeto para executar o comado sql.*/
                stmt.executeUpdate(slq); /*executeUpdate() é um metodo só executado pela statement, pois se trata de um update.*/

                ConexaoFactory.close(connection, stmt);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    public static void deletar(Integer id) {
        String slq = "DELETE FROM `agencia`.`comprador` WHERE (`id` = '" + id + "');";
        Connection connection = ConexaoFactory.getConexao();
        if (connection != null) {
            try {
                Statement stmt = connection.createStatement();
                stmt.executeUpdate(slq);

                ConexaoFactory.close(connection, stmt);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    public static void update(Comprador comprador) {
        String slq = "UPDATE `agencia`.`comprador` SET `nome` = '" + comprador.getNome() + "', `cpf` = '" + comprador.getCpf() + "' WHERE (`id` = '" + comprador.getId() + "');";
        Connection connection = ConexaoFactory.getConexao();
        if (connection != null) {
            try {
                Statement stmt = connection.createStatement();
                stmt.executeUpdate(slq);

                ConexaoFactory.close(connection, stmt);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
    public static List<Comprador> buscarPorNome(String nome) {
        String sql = "SELECT id, nome, cpf FROM agencia.comprador where nome LIKE '%" + nome + "%';";
        Connection connection = ConexaoFactory.getConexao();
        List<Comprador> compradorList = new ArrayList<>();

        if (connection != null) {
            try {
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                while (rs.next()) {
                    compradorList.add(new Comprador(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf")));
                }
                System.out.println(compradorList);
                ConexaoFactory.close(connection, stmt, rs);
                return compradorList;

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }

//      PREPEREDSTATEMENT É UM STATEMENT QUE NÃO PERMITE SQL INJECTION E TEM MELHOR PERFORMANCE.
    public static void updatePreparedStatement(Comprador comprador) {
        String sql = "UPDATE `agencia`.`comprador` SET `nome` = ?, `cpf` = ? WHERE (`id` = ?);";/* No preperedStatement só utiliza wildcard*/
        Connection connection = ConexaoFactory.getConexao();
        if (connection != null) {
            try {
                PreparedStatement ps = connection.prepareStatement(sql); /*Recebe a conexão e prepara o comnando sql.*/
                ps.setString(1, comprador.getNome()); /*é preciso indicar as variáveis de entrada com os wildcards*/
                ps.setString(2, comprador.getCpf());
                ps.setInt(3, comprador.getId());
                ps.executeUpdate();



                ConexaoFactory.close(connection, ps);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

//    TYPE+SCHOLL É UMA CARACTERISTICA DO DRIVE DE CONEXÃO COM O BANCO DE DADOS.
    public static void testTypeScholl() {
        String sql = "SELECT id, nome, cpf FROM agencia.comprador;";
        Connection connection = ConexaoFactory.getConexao();

        if (connection != null) {
            try {
                Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);/*Set o drive para que seja insensitive*/
                ResultSet rs = stmt.executeQuery(sql);

                if (rs.last()) {/*Já vai direto para última linha*/
                    System.out.println(("Ultima linha: " + new Comprador(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf"))));
                    System.out.println("Número da última linha: " + rs.getRow());
                }
                /*Abaixo realizando testes do type_scroll_insensitive movendo ocursos na tabela de registros.*/
                System.out.println("Retornou para a primeira linha: " + rs.first());
                System.out.println("Primeira linha: " + rs.getRow());
                rs.absolute(4);
                System.out.println("Linha 4: " + new Comprador(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf")));
                rs.relative(-1); /*Como estamos na linha 4, com -1 voltamos uma linha*/
                System.out.println("Linha anterior 3: " + new Comprador(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf")));
                System.out.println(rs.isLast());/*saber se é o último*/
                System.out.println(rs.isFirst());/*saber se é o primeiro*/
                rs.afterLast(); /*vai uma posição a frente da última linha para que possamos manipular com previous.*/
                while (rs.previous()) {/*Como estamos na última linha, aqui ele faz a ordem inversa*/

                    System.out.println(("Ordem inversa com previous(): " + new Comprador(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf"))));
                }

                ConexaoFactory.close(connection, stmt, rs);

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    //    O PREPREADSTATAMENT ALEM DE MELHORAR A EFICIENCIA DE EXECUÇÃO DO SQL, ELE NAO PERMITE UMA SQL INJECTION!   IMPORTANTE!
    public static List<Comprador> searchPreparedStatement(String nome) {
        String sql = "SELECT id, nome, cpf FROM agencia.comprador where nome LIKE ?;";
        Connection connection = ConexaoFactory.getConexao();
        List<Comprador> compradorList = new ArrayList<>();

        if (connection != null) {
            try {
                PreparedStatement ps = connection.prepareStatement(sql);
                ps.setString(1, "%" + nome + "%");/*O 1 quer dizer o primeiro wildcard*/
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    compradorList.add(new Comprador(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf")));
                }
                System.out.println(compradorList);
                ConexaoFactory.close(connection, ps, rs);
                return compradorList;

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }

//    METADADOS DO BANCO DE DADOS É NECESSÁRIO CRIAR UM RESULTSET PARA RECEBER AS INFORMAÇÕES
    public static void obterMetaDados() {
        String sql = "SELECT * FROM agencia.comprador;";
        Connection connection = ConexaoFactory.getConexao();
        if (connection != null) {
            try {
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                ResultSetMetaData rmt = rs.getMetaData();
                System.out.println("Nome da tabela: " + rmt.getTableName(1));
                System.out.println("Numero de colunas: " + rmt.getColumnCount());
                int quantidadeColuna = rmt.getColumnCount();
                for (int i = 1; i <= quantidadeColuna; i++) {
                    System.out.println("Nome da coluna: " + rmt.getColumnName(i));
                    System.out.println("Tipo de variável: " + rmt.getColumnTypeName(i));
                    System.out.println("Tamanho da variável: " + rmt.getColumnDisplaySize(i));
                }
                ConexaoFactory.close(connection, stmt, rs);

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
//    METADADOS DO DRIVE DE CONEXÃO E INFORMAÇÕES DOS SOFTWARES É NECESSARIO APENAS UM ONJETO DATABASEMETADATA
    public static void checkDriverStatusDadosDoDrive() {
        String sql = "SELECT * FROM agencia.comprador;";
        Connection connection = ConexaoFactory.getConexao();

        if (connection != null) {
            try {
                DatabaseMetaData dbmt = connection.getMetaData();
                if (dbmt.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
                    System.out.println("TYPE_FORWARD_ONLY");
                    if (dbmt.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
                        System.out.println("CONCUR_UPDATABLE");
                    }
                }
                if (dbmt.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
                    System.out.println("TYPE_SCROLL_INSENSITIVE");
                    if (dbmt.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                        System.out.println("CONCUR_UPDATABLE");
                    }
                }
                if (dbmt.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
                    System.out.println("TYPE_SCROLL_SENSITIVE");
                    if (dbmt.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                        System.out.println("CONCUR_UPDATABLE");
                    }
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }


    public static void movendoCursorDBComprador() {
        String sql = "SELECT * FROM agencia.comprador;";
        Connection connection = ConexaoFactory.getConexao();

        try {
            DatabaseMetaData dbmt = connection.getMetaData();
            Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println(dbmt.updatesAreDetected(ResultSet.TYPE_SCROLL_INSENSITIVE));
            System.out.println(dbmt.insertsAreDetected(ResultSet.TYPE_SCROLL_INSENSITIVE));
            System.out.println(dbmt.deletesAreDetected(ResultSet.TYPE_SCROLL_INSENSITIVE));
            if (rs.next()) {
                rs.updateString("nome", rs.getString("nome").toLowerCase());/*Aqui pega o registro e altera.*/
                /*aqui, antes de fazer o update, eu poderia tambem fazer calculos elaborados ou algo mais complexo antes do update.*/
                rs.cancelRowUpdates(); /*Para voltar os registros para um estado original esse método é o melhor, e tem que ser antes do updateRow*/
                rs.updateRow();/*Faz o update da linha conforme o rs alterado.*/

//                if(rs.rowUpdated()){/*Retorna se a coluna foi atualizada de fato.*/
//                    System.out.println("Linha atualizada!");
//                }
            }
//            rs.beforeFirst();/*voltei para primeira linha*/
//            while (rs.next()) {
//                System.out.println(rs.getString("nome"));
//            }


//          MOVENDO O CURSOR EM RELAÇÃO A UM PONTO DE REFERÊNCIA DENTRO DOS RESGISTROS.
            rs.absolute(2);
            String nome = rs.getString("nome");
            rs.moveToInsertRow(); /*da posição 2 ele vai até a ultima linha para poder inserir um novo registro, mas fica registrado sua última posição*/
            rs.updateString("nome", nome.toLowerCase());
            rs.updateString("cpf", "999.999.999-99");
            rs.insertRow();/*faz a inserção do registro uma linha apos a última no banco de dados.*/
            rs.moveToCurrentRow();/*retorna para a posição anterior, nesse caso para linha 2.*/
            System.out.println(rs.getString("nome") + " row:" + rs.getRow());

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    //    CALLABLESTATEMENT É UMA CLASSE QUE EXECUTA COMANDOS STORED PROCEDURES DO SQL
    public static void buscarPorNomeCallableStatament(String nome) {
        String sql = "CALL `agencia`.`sp_getCompradoresPorNome`(?) ;";/*StoreProcedures não necessariamente retornam valores.*/
        Connection connection = ConexaoFactory.getConexao();
        List<Comprador> compradorList = new ArrayList<>();

        if (connection != null) {
            try {
                CallableStatement cs = connection.prepareCall(sql);
                cs.setString(1, "%" + nome + "%");/*O 1 quer dizer o primeiro wildcard*/
                ResultSet rs = cs.executeQuery();

                while (rs.next()) {
                    compradorList.add(new Comprador(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf")));
                }
                System.out.println(compradorList);
                ConexaoFactory.close(connection, cs, rs);

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    //    ROWSET É UM RESULTSET COM UMA SINTAXE MAIS SIMPLES. TEMOS DOIS TIPOS, UM CONECTADO, E VARIOS DESCONECTADOS.
    //    JDBCROWSET É UM DO TIPO CONECTADO.
    public static void buscaCompradorPorIDRowSet(Integer id) {
        String sql = "SELECT * FROM comprador where id = ?";
        JdbcRowSet jrs = ConexaoFactory.getRowSetConnection();
        jrs.addRowSetListener(new MyRowSetListener());  /*O listener realiza o execute() para que mantenha a sincronia no banco de dados
        contornando o problema de sync pois o RowSet só mantem sincronia quando realiza a ação execute().*/
        try {
            jrs.setType(ResultSet.TYPE_SCROLL_INSENSITIVE);
            jrs.setCommand(sql);
            jrs.setInt(1, id);
            jrs.execute();
            jrs.next();
            jrs.updateString("nome", "WILLIAM SUANE");
            jrs.updateRow();

            ConexaoFactory.close(jrs);
            System.out.println("Atualizado com sucesso");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    //    UTILIZANDO JDBCROWSET COM STORED PROCEDURES.
    public static void buscarPorNomeJdbcRowSETProcedure(String nome) {
        String sql = "CALL `agencia`.`sp_getCompradoresPorNome`(?) ;";
        JdbcRowSet jrs = ConexaoFactory.getRowSetConnection();
        jrs.addRowSetListener(new MyRowSetListener());
        List<Comprador> compradorList = new ArrayList<>();

        try {
            jrs.setCommand(sql);
            jrs.setString(1, "%" + nome + "%");
            jrs.execute();

            while (jrs.next()) {
                compradorList.add(new Comprador(jrs.getInt("id"), jrs.getString("nome"), jrs.getString("cpf")));
            }
            System.out.println(compradorList);
            ConexaoFactory.close(jrs);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    //    NÃO É POSSÍVEL REALIZAR UPDATE, DELET OU INSERT COM ROWSET POIS OCORRE ERRO DE SYNC. PARA ISSO TENHO QUE REALIZAR OS PASSA ABAIXO!!
//        TEMOS QUE COLOCAR UM LISTENER E CHAMAR UM EXECUTE!!!!!
    public static void updateRowSet(Comprador comprador) {
        if (comprador == null || comprador.getId() == null) {
            System.out.println("Nâo foi possível atualizar o registro: dados incompletos.");
            return;
        }
        String sql = "SELECT * FROM comprador where id = ?"; /*Ele nao executa o comando Update, mas podemos fazer manualmente*/
        JdbcRowSet jrs = ConexaoFactory.getRowSetConnection(); /*Ele fecha a conexão automaticamente*/
        try {
            jrs.setCommand(sql);  /*Selecionando tudo*/
            jrs.setInt(1, comprador.getId());  /*Pegando a linha indicada*/
            jrs.execute(); /*executando*/ /*Para manter os registros atualizados teria que executar o execute novamente. entao pode dar erro de sync*/

            jrs.next(); /*da lista retornada vou para a primeira posição, que nesse caso é o proprio registro a fazer update */
            jrs.updateString("nome", comprador.getNome());  /*set os dados do update*/
            jrs.updateString("cpf", comprador.getCpf());
            jrs.updateRow(); /*não persiste, precisamos de um execute() por listener tambem!!!*/

            ConexaoFactory.close(jrs); /*por fim fecho a conexao.*/
            System.out.println("Atualizado com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateRowSetCached(Comprador comprador) {
        if (comprador == null || comprador.getId() == null) {
            System.out.println("Nâo foi possível atualizar o registro: dados incompletos.");
            return;
        }
        String sql = "SELECT * FROM comprador where id = ?";
        CachedRowSet crs = ConexaoFactory.getRowSetConnectionCached();
        try {
            crs.setCommand(sql);
            crs.setInt(1, comprador.getId());
            crs.execute();

            crs.next();
            crs.updateString("nome", comprador.getNome());
            crs.updateString("cpf", comprador.getCpf());
            crs.updateRow();
            crs.acceptChanges();/*dá erro pois apesar de atualizar, pois dá erro de sync. Na conexão tenho que insetir relexAutoCommit=true*/

            /*O cached é por natureza offonline e fecha sozinho a conexão*/
            System.out.println("Atualizado com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


//    TRANSAÇÕES: QUANDO TENHO QUE FAZER O COMMITE DE DIVERSOS REGISTROS DE UMA VEZ SÓ QUANDO TODOS FOREM ACEITOS, CASO CONTRARIO RETORNO AO ESTADO ANTERIOR NO BANCO DE DADOS
    public static void saveTransaction() {
        String slq = "INSERT INTO `agencia`.`comprador` (`nome`, `cpf`) VALUES ('TEST1', 'TEST1');";
        String slq2 = "INSERT INTO `agencia`.`comprador` (`nome`, `cpf`) VALUES ('TEST2', 'TEST2');";
        String slq3 = "INSERT INTO `agencia`.`comprador` (`nome`, `cpf`) VALUES ('TEST3', 'TEST3');";
        Connection connection = ConexaoFactory.getConexao();

        Savepoint savepoint = null; /*Caso em um das etapas da transação nao seja aceita, mas se queira salvar parte do processo para dar continuidade*/
        if (connection != null) {
            try {
                connection.setAutoCommit(false);  /*Primeiro preciso tornar o autocomit falso*/
                Statement stmt = connection.createStatement();
                stmt.executeUpdate(slq);
                // IMPORTANTE CHECAR SE O DRIVE SUPORTA MAIS QUE UM SAVEPONT NO DATABASEMETADATA
                savepoint = connection.setSavepoint("One"); /*Salva o processo até aqui*/
//                connection.releaseSavepoint(savepoint);/*Caso o drive permita apenas um savepoint, podemos reutilizar esse liberando-o*/
                stmt.executeUpdate(slq2);
                if(true)
                    throw new SQLException();
                stmt.executeUpdate(slq3);
                connection.commit();


                ConexaoFactory.close(connection, stmt);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
                try {
                    connection.rollback(savepoint);  /*MUITO IMPORTANTE PARA TRANSAÇÕES, RETORNA O ESTADO DO BANCO PARA ANTES DA TRANSAÇÃO!!!*/
                    connection.commit(); /*Então nesse caso ele vai salvar pelo menos parte do processo no BD.*/
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}




