package basic.Pinterfaces.classes;

public class Produto implements Tributavel, Transportavel{

    private String name;
    private double peso;
    private double preco;
    private double precoFinal;
    private double valorFrete;


    @Override
    public void calcularImposto() {
    precoFinal = this.preco + (this.preco*IMPOSTO);
    }

    @Override
    public void calcularFrete() {

        this.valorFrete = this.preco/peso*0.1;
    }

    public Produto(String name, double peso, double preco) {
        this.name = name;
        this.peso = peso;
        this.preco = preco;
    }

    public Produto() {
    }

    @Override
    public String toString() {
        return "Produto{" +
                "name='" + name + '\'' +
                ", peso=" + peso +
                ", preco=" + preco +
                ", precoFinal com Imposto=" + precoFinal +
                ", valorFrete=" + valorFrete +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
