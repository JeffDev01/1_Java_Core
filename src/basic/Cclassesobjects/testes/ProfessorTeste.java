package basic.Cclassesobjects.testes;

import basic.Cclassesobjects.classes.Professor;

public class ProfessorTeste {

    public static void main(String[] args) {
        Professor prof = new Professor();
        Professor prof2 = new Professor();

        prof.nome = "Rodrigo";
        prof.cpf = "382.838.878-74";
        prof.rg = "40.988.824-2";
        prof.matricula = "162053614";
        prof2.nome = "João";
        prof2.cpf = "235.524.254-78";
        prof2.rg = "30.358.877-85";
        prof2.matricula = "15325215";

        System.out.println(prof.nome);
        System.out.println(prof.cpf);
        System.out.println(prof.rg);
        System.out.println(prof.matricula);
        System.out.println("----------------------------");
        System.out.println(prof2.nome);
        System.out.println(prof2.cpf);
        System.out.println(prof2.rg);
        System.out.println(prof2.matricula);

    }


}
