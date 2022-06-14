package basic.Qpolimorfismo.classes;

public class Vendedor extends Funcionario{

    private double totalDeVendas;

    public Vendedor(String nome, double salario, double totalDeVendas) {
        super(nome, salario);
        this.totalDeVendas = totalDeVendas;
    }

    @Override
    public void calcularPagament() {
    this.salario = this.salario + (totalDeVendas*0.05);
    }







    public double getTotalDeVendas() {
        return totalDeVendas;
    }

    public void setTotalDeVendas(double totalDeVendas) {
        this.totalDeVendas = totalDeVendas;
    }
}
