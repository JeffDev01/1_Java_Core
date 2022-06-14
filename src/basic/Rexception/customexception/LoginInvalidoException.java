package basic.Rexception.customexception;

public class LoginInvalidoException extends Exception {

    public LoginInvalidoException(){
        super("Usuário ou senha inválidos!");
    }




}
