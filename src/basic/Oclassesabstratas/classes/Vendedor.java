package basic.Oclassesabstratas.classes;

public class Vendedor extends Funcionario{

    private double totalVendas;

    public Vendedor(String nome, String clt, double salario, double totalVendas) {
        super(nome, clt, salario);
        this.totalVendas = totalVendas;
    }

    public Vendedor() {

    }
    @Override
    public void imprime(){

    }

    //Obrigatoriamente sou obrigado a sobrescrever um metodo que vem de uma
    //classe abstrata que foi extendida.
    @Override
    public void calculaSalario() {
    this.salario =  salario+(salario*0.2);

    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' +
                ", clt='" + clt + '\'' +
                ", salario=" + salario +
                ", totalVendas=" + totalVendas +
                '}';
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }
}
