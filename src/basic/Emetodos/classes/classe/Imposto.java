package basic.Emetodos.classes.classe;

public class Imposto {
    public String nome;
    public double salario;
    public int mesesTrabalhado;


    public void calculoSalarioAnual(Imposto parametros) {
        double salarioAnual;
        salarioAnual = parametros.salario * parametros.mesesTrabalhado * 1.2;
        System.out.println("Nome: " + parametros.nome);
        System.out.println("Salário mensal: " + parametros.salario);
        System.out.println("Salário anual: " + salarioAnual);
        System.out.println("------------");

    }
    public void dadosFuncionariosSemParametroAux() {
        double salarioAnual;
        salarioAnual = this.salario * this.mesesTrabalhado * 1.2;
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário mensal: " + this.salario);
        System.out.println("Salário anual: " + salarioAnual);
        System.out.println("------------");


    }

    public void horasTrabalhadasSemana(String nome, double... horasDia) {
        System.out.println("Relatório do Funcionário: " + nome);
        int diasSemana = 0;
        for (double horas : horasDia) {
            diasSemana = diasSemana + 1;
            if (diasSemana == 1) {
                System.out.println("Segunda: " + horas + " hs");
            } else if (diasSemana == 2) {
                System.out.println("Terça: " + horas + " hs");
            } else if (diasSemana == 3) {
                System.out.println("Quarta: " + horas + " hs");
            } else if (diasSemana == 4) {
                System.out.println("Quinta: " + horas + " hs");
            } else if (diasSemana == 5) {
                System.out.println("Sexta: " + horas + " hs");
            } else if (diasSemana == 6) {
                System.out.println("Sábado: " + horas + " hs");
            } else if (diasSemana == 7) {
                System.out.println("Domingo: " + horas + " hs");
            }
        }

    }




}
