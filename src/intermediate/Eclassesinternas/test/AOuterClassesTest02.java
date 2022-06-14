package intermediate.Eclassesinternas.test;

public class AOuterClassesTest02 {

    private String nome = "Lucas Ribeiro";

    //Classe Local é classe dentro de um método
    /*Quando temos um atributo dentro de um metodo ele morre assim que é executado se nao for final*/
    void print(){
        String lastName = "Buzo";/*Por esse motivo nesse caso ele considera que esse atributo é final, ou seja imutável*/
        class LocalClass{
            public void printName(){
                System.out.println(nome+" "+lastName);
            }
        }
        new LocalClass().printName();
    }

    public static void main(String[] args) {
        AOuterClassesTest02 outer = new AOuterClassesTest02();
        outer.print();

    }
}
