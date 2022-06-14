package basic.Qpolimorfismo.classes;

public class RelatorioPagamento {

//    public void relatorioPagamentoGerente(Gerente gerente){
//
//        System.out.println("RELATÓRIO DE PAGAMENTO DO GERENTE");
//        gerente.calcularPagament();
//        System.out.println("Nome: "+ gerente.getNome());
//        System.out.println("Salário desse mês: "+ gerente.getSalario());
//
//    }
//
//    public void relatorioPagamentoVendedor(Vendedor vendedor){
//        System.out.println("RELATÓRIO DE PAGAMENTO DO VENDEDOR");
//        vendedor.calcularPagament();
//        System.out.println("Nome: "+vendedor.getNome());
//        System.out.println("Salário desse mês: "+vendedor.getSalario());
//    }

    public void relatorioPagamentoGenerico(Funcionario funcionario){ //funcionario se chama parametros polimorficos
        System.out.println("RELATÓRIO DE PAGAMENTO DO VENDEDOR");
        funcionario.calcularPagament();
        System.out.println("Nome: "+funcionario.getNome());
        System.out.println("Salário desse mês: "+funcionario.getSalario());
        if(funcionario instanceof Gerente){

            Gerente g = (Gerente) funcionario; //casting explícito Cast Down
            System.out.println("Participação nos lucros: "+g.getParticipacaoLucros());
        }if(funcionario instanceof  Vendedor){
//            Vendedor v= (Vendedor) funcionario;
//            ((Vendedor) funcionario ).getTotalDeVendas();
//            System.out.println("Total vendas: "+v.getTotalDeVendas());
            System.out.println("Total vendas: "+ ((Vendedor) funcionario ).getTotalDeVendas());
        }
    }


}
