package basic.Rexception.checkedexceptions.test;

import basic.Rexception.checkedexceptions.classes.Funcionario;
import basic.Rexception.checkedexceptions.classes.Pessoa;
import basic.Rexception.customexception.LoginInvalidoException;

public class SobreEscritaComExceptionTest {
    public static void main(String[] args) {

        Funcionario f = new Funcionario();
        Pessoa p = new Pessoa();


        try {
            f.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }


    }

}
