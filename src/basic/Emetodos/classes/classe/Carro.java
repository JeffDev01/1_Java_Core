package basic.Emetodos.classes.classe;

public class Carro {
    public String marca;
    public String modelo;
    public String placa;


    public void imprimirDados(){
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Placa: "+this.placa);
        System.out.println("__________________________");
        this.marca = "Alterado dentro do metodo";
        System.out.println(this.marca);
        //a variável de referencia recebe o valor da outra classe, entretanto
        //esse valor é alterado dentro do modelo pois é chamado a variável de referencia para receber o valor declarado.
    }



}
