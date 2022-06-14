package basic.Jassociacao.exercicioclasses;

public class Medico {

    private String nome;
    private String especialidade;
    private Hospital hospital;
    private Paciente[] pacientes;


    public Medico(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Medico() {
    }


    public void relatorioMedico(){
        System.out.println("RELATÓRIO DO MÉDICO:");
        System.out.println("Nome: "+this.nome);
        System.out.println("Especialidade: "+this.especialidade);
        System.out.println("Hospital: "+this.hospital.getBandeira());
        System.out.println("Parcientes atendidos: ");
        for(Paciente pac : pacientes){
            if(pacientes != null && pacientes.length>0) {
                System.out.println(pac.getNome());
            }else {
                System.out.println("Não há nenhum paciente associado a esse médico");
            }
        }
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Paciente[] getPacientes() {
        return pacientes;
    }

    public void setPacientes(Paciente[] pacientes) {
        this.pacientes = pacientes;
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
