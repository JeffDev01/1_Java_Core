package intermediate.Eclassesinternas.test;

class Animal{
    public void walk(){
        System.out.println("Animal Walking");
    }
}

class Dog extends Animal{
    @Override
    public void walk() {
        System.out.println("Dog walking");
    }
}

public class BAnonymousClassesTest01 {
    public static void main(String[] args) {
        Animal animal = new Animal(){ /*Abrindo chaves estou criando uma classe anônima apenas para executar algo*/
            /*Aqui é uma subclasse de animal*/

            @Override
            public void walk() {
                System.out.println("Something walking");
            }
        };
        animal.walk();

    }
}
