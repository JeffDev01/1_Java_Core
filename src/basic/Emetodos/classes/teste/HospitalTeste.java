package basic.Emetodos.classes.teste;

import basic.Emetodos.classes.classe.Hospital;

public class HospitalTeste {

    public static void main(String[] args) {

        Hospital paciente1= new Hospital();

        paciente1.nome="Jefferson Borges";
        paciente1.tipoSanguinio="A+";
        paciente1.id="4066552";

        Hospital paciente2 = new Hospital();
        paciente2.nome  ="Carlor Lima";
        paciente2.tipoSanguinio="O-";
        paciente2.id="3525080";

        paciente1.imprime();

        paciente2.imprime();


    }
}
