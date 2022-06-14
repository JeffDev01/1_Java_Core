package basic.Kheranca.exercicioclasses;

public class Aluno extends Pessoa {
    private String serie;


    public Aluno(String nome, int idade, char sexo, String serie) {
        super(nome, idade, sexo);
        this.serie = serie;

    }

    public Aluno() {
    }

    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Serie: "+serie);
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }
}

