package basic.Pinterfaces.test;

import basic.Pinterfaces.classes.Produto;

public class ProdutoTest {
    public static void main(String[] args) {
        Produto p = new Produto("Notebook",4,3000);
        p.calcularImposto();
        p.calcularFrete();
        System.out.println(p);
    }
}
