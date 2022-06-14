package basic.Jassociacao.classes;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Professor professor;
    private Local local;


    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario() {
    }

    public void print(){
        System.out.println("Título: "+this.titulo);
        if(professor.getNome() != null){
            System.out.println("Professor: "+professor.getNome());
        }else {
            System.out.println("Nenhum professor associado com esse seminário");
        }
        if(local != null) {

            System.out.println("Local: " + local.getRua() + ", Bairro: " + local.getBairro());
        }else{
            System.out.println("Nenhum endereço associado a esse seminário");
        }
        if(alunos != null && alunos.length != 0){
        System.out.println("Lista de alunos:");
        for(Aluno aluno : alunos){
            System.out.println(aluno.getNome());
        }}else{
            System.out.println("Nenhum aluno foi cadastrado nesse seminário");
        }
    }


    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
