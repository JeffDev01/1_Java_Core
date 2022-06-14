package basic.Emetodos.classes.teste;

import basic.Emetodos.classes.classe.MetodosGettersSettersEstudante;

public class MetodosGettersSettersEstudanteTeste {

    public static void main(String[] args) {

        MetodosGettersSettersEstudante estudante1 = new MetodosGettersSettersEstudante();

        estudante1.setNome("Gabriel de Lima");
        estudante1.setIdade(28);
        estudante1.setNotas(new double []{10,5,0,5});

        estudante1.print();
        estudante1.tirarMedia();
        System.out.println(estudante1.isAprovado());








    }



}
