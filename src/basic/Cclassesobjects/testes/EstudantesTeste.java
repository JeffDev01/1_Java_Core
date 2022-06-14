package basic.Cclassesobjects.testes;


import basic.Cclassesobjects.classes.Estudantes;

public class EstudantesTeste {
    public static void main(String[] args){

        Estudantes aluno1 = new Estudantes();
        aluno1.nome="João";
        aluno1.idade = 20;
        aluno1.matricula="162053614";

        System.out.println(aluno1.nome);
        System.out.println(aluno1.idade);
        System.out.println(aluno1.matricula);

    }


}
