package basic.Emetodos.classes.teste;

import basic.Emetodos.classes.classe.Professor;

public class ProfessorTeste {

    public static void main(String[] args) {
        Professor prof1 = new Professor();
        prof1.cpf="382.838.878-74";
        prof1.matricula="1000101";
        prof1.nome="Marcelo";
        prof1.rg="409888277-2";

        Professor prof2 = new Professor();
        prof2.cpf="430.505.512-74";
        prof2.matricula="78500101";
        prof2.nome="João";
        prof2.rg="50.510519003";

        prof1.imprime(prof1);
        prof1.imprime(prof2);









    }



}

