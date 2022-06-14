package basic.Jassociacao.classes;

public class Professor {

    private String nome;
    private String especialidade;
    private Seminario[] seminarios;


    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor() {
    }

    public void print() {
        System.out.println("RELATÓRIO DO PROFESSOR");
        System.out.println("Nome: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        System.out.println("Seminarios ministrados: ");
        if (seminarios != null && seminarios.length != 0) {
            for (Seminario sem : seminarios) {
                System.out.println(sem.getTitulo());
                return;
            }
            System.out.println("Professor nao está vinculado a nenhum seminário ");
        }
    }


    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
