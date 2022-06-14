package basic.Jassociacao.exerciciotest;

import basic.Jassociacao.exercicioclasses.Hospital;
import basic.Jassociacao.exercicioclasses.Medico;
import basic.Jassociacao.exercicioclasses.Paciente;

public class HospitalTest {
    public static void main(String[] args) {

        Hospital hospital1 = new Hospital("Amil");

        Paciente p1 = new Paciente("Jefferson", "22222-2");
        Paciente p2 = new Paciente("Marcelo", "33333-3");
        Paciente p3 = new Paciente("Gabriel", "44444-4");

        Medico m1 = new Medico("Dr. Arthur","Dermatologista");
        Medico m2 = new Medico("Dr. Rafael","Oftalmologista");

        hospital1.setMedicos(new Medico[]{m1, m2});
        hospital1.setPacientes(new Paciente[] {p1,p2,p3});

        m1.setHospital(hospital1);
        m1.setPacientes(new Paciente[] {p1, p2, p3});

//        hospital1.relatorioHospital();

        m1.relatorioMedico();







    }

}
