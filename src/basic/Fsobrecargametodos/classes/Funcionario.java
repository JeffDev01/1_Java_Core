package basic.Fsobrecargametodos.classes;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private String rg;

    public Funcionario(String nome) {
        System.out.println("Dentro do Construtor");
        this.nome = nome;
    } //posso usar sobrecarga de métodos com construtores também.


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public double getSalario() {
        return this.salario;
    }

    public String getRg() {
        return this.rg;
    }


    public void init(String nome, String cpf, int salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public void init(String nome, String cpf, int salario, String rg) { //Sobrecarga de métodos OverLoad
        init(nome, cpf, salario);
        this.rg = rg;

    }

    public void imprimi() {
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.salario);
        System.out.println(this.rg);
    }

}
