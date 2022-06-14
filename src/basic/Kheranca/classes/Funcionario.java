package basic.Kheranca.classes;

public class Funcionario extends Pessoa {

    private double salario;


    public Funcionario(String nome){
        super(nome);

    }

    {
        System.out.println("Bloco de inicialização ESTATICO funcinario");
    }
    {
        System.out.println("Bloco de inicialização  funcionario 1");
    }


    public void imprime(){
        super.imprime();
        System.out.println("Salário: "+this.salario);
        imprimeRecibo();
    }

    public void imprimeRecibo(){
        System.out.println("Eu "+super.nome+" recebi o pagamento total de "+this.salario);
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
