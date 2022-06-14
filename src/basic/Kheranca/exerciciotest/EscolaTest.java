package basic.Kheranca.exerciciotest;

import basic.Kheranca.exercicioclasses.Aluno;
import basic.Kheranca.exercicioclasses.Pessoa;

public class EscolaTest {

    public static void main(String[] args) {
        Pessoa p1  = new Pessoa("João",28, 'M');
        p1.imprimir();

        System.out.println("-----------------------");

        Aluno a1 = new Aluno("Lucas", 17, 'M', "3°A");
        a1.imprimir();

    }

}
