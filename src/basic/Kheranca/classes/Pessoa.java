package basic.Kheranca.classes;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected String endereco;



    public Pessoa(String nome){
        this.nome = nome;
    }

    static{
        System.out.println("Bloco de inialização ESTATICO Pessoa ");
    }
    {
        System.out.println("Bloco de inialização 1 Pessoa");
    }
    {
        System.out.println("Bloco de inialização 2 Pessoa");
    }

    public void imprime(){
        System.out.println("Nome: "+this.nome);
        System.out.println("CPF: "+this.cpf);
        System.out.println("Endereço: "+this.endereco);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
