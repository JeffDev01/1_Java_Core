package basic.Emetodos.classes.teste;

import basic.Emetodos.classes.classe.Imposto;

public class ImpostoTeste {

    public static void main(String[] args) {

        //utilizando parêmetros de referencias
        Imposto funcionario1 = new Imposto();
        funcionario1.nome="Jefferson Borges de Brito";
        funcionario1.salario=1000.0d;
        funcionario1.mesesTrabalhado=10;

        funcionario1.calculoSalarioAnual(funcionario1);

        //Sem utilizar parametros de referencia, usando apenas this.
        Imposto funcionario2 = new Imposto();
        funcionario2.nome="João Guilherme";
        funcionario2.salario=2000.0d;
        funcionario2.mesesTrabalhado=20;

        funcionario2.dadosFuncionariosSemParametroAux();

        //utilizando a chamara de arrays com métodos VarArgs
        funcionario1.horasTrabalhadasSemana("Marcelo Rodrigues",8,9,6,7,8,8,0);





    }


}
