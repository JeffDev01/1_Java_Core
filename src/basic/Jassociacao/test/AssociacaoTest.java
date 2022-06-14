package basic.Jassociacao.test;

import basic.Jassociacao.classes.Aluno;
import basic.Jassociacao.classes.Local;
import basic.Jassociacao.classes.Professor;
import basic.Jassociacao.classes.Seminario;

public class AssociacaoTest {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Marcelo", 30);
        Aluno aluno2 = new Aluno("Jefferson", 32);

        Seminario javaFX = new Seminario("Curso sobre JavaFX");
        Seminario python = new Seminario("BootCamp Python");
        Professor professor1 = new Professor("Willian", "Programação em Linguagem Java");
        Local local = new Local("Rua dos Esquilo 722","Jardim do Engenho");



        aluno1.setSeminario(javaFX);
        aluno2.setSeminario(javaFX);

        javaFX.setLocal(local);
        javaFX.setProfessor(professor1);
        //javaFX.setAlunos(new Aluno[] {aluno1,aluno2});


        professor1.setSeminarios(new Seminario[]{javaFX,python });

        javaFX.print();
//      professor1.print();

//        aluno1.print();
//        aluno2.print();




    }


}
