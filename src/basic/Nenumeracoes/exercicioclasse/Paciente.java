package basic.Nenumeracoes.exercicioclasse;

public class Paciente {

    private String nome;
    private int idade;
    private TipoSanguineo tipo;

    public Paciente(String nome, int idade, TipoSanguineo tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    public void imprimir(){
        System.out.println(tipo.getNumeroTipo());
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", tipo=" + tipo +
                '}';
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

    public TipoSanguineo getTipo() {
        return tipo;
    }

    public void setTipo(TipoSanguineo tipo) {
        this.tipo = tipo;
    }
}
