package basic.Rexception.customexception;

public class CustonExceptionTest {

    public static void main(String[] args) {

        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }


    }

    public static void logar() throws LoginInvalidoException {
        String usuario = "João";
        String senha = "111";
        String usuarioDigitado = "João";
        String senhaDigitado = "1230";
        if(!usuario.equals(usuarioDigitado) || !senha.equals(senhaDigitado)){
            throw new LoginInvalidoException();
        }else{
            System.out.println("Logado");
        }


    }

}
