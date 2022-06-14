package basic.Lsobrescritametodos.classes;

public class Pessoa {

    private String nome;
    private int idade;

    @Override
    public String toString(){ //estamos sobreescrevendo a classe Object do metodo toString
        return "Nome: "+this.nome+", Idade: "+this.idade;

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
