package basic.Emetodos.classes.classe;

public class Estudante {


    public void mediaFinal(String nome, int idade, double... notas){
        System.out.println("Aluno: "+nome);
        System.out.println("Idade: "+idade);
        double media =0;
        double soma=0;
        for(double aux: notas){
            soma+=aux;
        }
        media=soma/notas.length;
        System.out.println("Média final: "+media);
        if(media>=6){
            System.out.println("Situação: Aprovado");
        }else{
            System.out.println("Situação: Reprovado.");
        }
        System.out.println("__________________");
    }

}
