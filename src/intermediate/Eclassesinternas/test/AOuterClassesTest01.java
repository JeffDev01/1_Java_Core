package intermediate.Eclassesinternas.test;

public class AOuterClassesTest01 {
    /*Inner classes ou classes internas foram feiras para lidar com ação altamente acompladas mas ao mesmo tempo
    * tem que ter certa coesão da classe, por exemplo ao lidar com comportamentos de botões. É muito utilizado
    * no Design Pattern*/

    private String name = "Jefferson Borges";

    //INNER CLASS
    class Inner{
        /*Temos acesso ao todos os atributos das classes externas mesmo que privado*/
        public void printOuterClasseAtributte(){
            System.out.println(name);
            System.out.println(this);/*Access ao Inner Object*/
            System.out.println(AOuterClassesTest01.this);/*Accesso ao object Outer*/
        }

    }
    public static void main(String[] args) {
        AOuterClassesTest01 outer = new AOuterClassesTest01();
        Inner inner = outer.new Inner();
        inner.printOuterClasseAtributte();

    }
}
