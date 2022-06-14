package basic.Nenumeracoes.exerciciotest;

import basic.Nenumeracoes.exercicioclasse.Paciente;
import basic.Nenumeracoes.exercicioclasse.TipoSanguineo;

public class PacienteTest {
    public static void main(String[] args) {
        Paciente p1 = new Paciente("Lucas", 30, TipoSanguineo.A_POSITIVO);

        System.out.println(p1);
        p1.imprimir();


    }

}
