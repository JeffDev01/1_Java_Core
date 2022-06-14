package basic.Jassociacao.exercicioclasses;

public class Hospital {
    private String bandeira;
    private Medico[] medicos;
    private Paciente[] pacientes;

    public Hospital(String bandeira) {
        this.bandeira = bandeira;
    }

    public Hospital() {
    }

    public void relatorioHospital(){
        System.out.println("RELATÓRIO HOSPITAL");
        System.out.println("Bandeira: "+this.bandeira);
        System.out.println("Medicos que trabalham no hospital:");
        for(Medico med : medicos){
            if(medicos != null && medicos.length>0){
                System.out.println(med.getNome());
            } else {
                System.out.println("Não há medicos cadastrados nesse hospital");
            }
        }
        System.out.println("Lista de pacientes cadastrados:");
        for(Paciente pas : pacientes){
            if(pacientes != null && pacientes.length >0){
                System.out.println(pas.getNome());
            }else {
                System.out.println("Não há pacientes cadastrados nesse hospital");
            }
        }

    }




    public Paciente[] getPacientes() {
        return pacientes;
    }

    public void setPacientes(Paciente[] pacientes) {
        this.pacientes = pacientes;
    }

    public Medico[] getMedicos() {
        return medicos;
    }

    public void setMedicos(Medico[] medicos) {
        this.medicos = medicos;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }
}
