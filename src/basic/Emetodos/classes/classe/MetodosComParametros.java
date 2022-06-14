package basic.Emetodos.classes.classe;

public class MetodosComParametros {

    public void calcularDoisNumeros(int numero1, int numero2) {
        System.out.println("Resultado: " + (numero1 * numero2));
    }

    public void juntarNomes(String nome1, String nome2){
        System.out.println("Os alunos nessa classe são: "+nome1+" e "+nome2);

    }

    public double somaImposto(double salario, double bonus){
        return salario+salario*bonus;
    }


    public void aleteraDoisNumeros(int num1, int num2){
        num1=30;
        num2=50;
        System.out.println("Dentro do método:");
        System.out.println("num1: "+num1+" num2: "+num2);
    }




}
