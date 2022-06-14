package basic.Jassociacao.exercicioclasses;

public class Paciente {
    private String nome;
    private String matricula;
    private Medico medico;
    private Hospital hospital;


    public Paciente(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public Paciente() {
    }

    public void relatorioPaciente(){
        System.out.println("RELATÓRIO PACIENTE");
        System.out.println("Nome: "+this.nome);
        System.out.println("Matrícula: "+this.matricula);
        System.out.println("Dados de Consulta: Medico "+medico.getNome()+ ", Especialidade: "+medico.getEspecialidade());
    }




    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
