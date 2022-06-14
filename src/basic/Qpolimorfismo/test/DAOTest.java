package basic.Qpolimorfismo.test;

import basic.Qpolimorfismo.classes.ArquivoDAOImpl;
import basic.Qpolimorfismo.classes.GenerecDAO;

public class DAOTest {
    public static void main(String[] args) {

        GenerecDAO arquivoDAO = new ArquivoDAOImpl();
        arquivoDAO.save();



    }
}
