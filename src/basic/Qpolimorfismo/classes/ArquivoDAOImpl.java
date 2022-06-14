package basic.Qpolimorfismo.classes;

public class ArquivoDAOImpl implements GenerecDAO{
    @Override
    public void save() {
        System.out.println("Salvando dados nos arquivos");
    }
}
