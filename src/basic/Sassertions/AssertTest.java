package basic.Sassertions;

public class AssertTest {
    public static void main(String[] args) {

        calculaSalario(-1000);


    }

    private static void calculaSalario(double salario) {
        assert (salario > 0): "O salario está negativo: "+salario;
        //caso nao seja true, isso é um erro muito grave.
        //calculo do salario; Usar assert somente com metodo private
    }
}
