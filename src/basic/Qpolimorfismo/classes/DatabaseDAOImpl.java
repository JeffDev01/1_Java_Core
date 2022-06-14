package basic.Qpolimorfismo.classes;

public class DatabaseDAOImpl implements GenerecDAO{
    @Override
    public void save() {
        System.out.println("Salvando dados no banco de dados");
    }
}
