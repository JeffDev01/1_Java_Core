package basic.Emetodos.classes.classe;

public class MetodosGettersSettersEstudante {

    private String nome;
    private int idade;
    private double[] notas;
    private boolean aprovado;


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }


    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double[] getNotas() {
        return this.notas;
    }

    public boolean isAprovado() {
        return this.aprovado;
    }

    public void print() {
        System.out.println("Aluno: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.print("Notas: ");
        for (double nota : notas) {
            System.out.print(nota + " ");
        }
    }

    public void tirarMedia() {
        if (this.notas == null) {
            System.out.println("Esse aluno não possui notas");
            return;
        }
        double media = 0;
        for (double nota : notas) {
            media += nota;
        }
        media = media / this.notas.length;

        if (media >= 6) {
            this.aprovado = true;
            System.out.println("\nA média é: " + media + " Situação: Aprovado");
        } else {
            this.aprovado = false;
            System.out.println("\nA média é: " + media + " Situação: Reprovado");
        }


    }


}
