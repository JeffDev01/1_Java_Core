package intermediate.Dgenerics.test;

abstract class Animal {
    public abstract void consult();
}

class Dog extends Animal {

    @Override
    public void consult() {
        System.out.println("Consultando Dogs");
    }
}

class Cat extends Animal {

    @Override
    public void consult() {
        System.out.println("Consultando Cats");
    }
}

public class BWildCardTest01 {
    public static void main(String[] args) {

        Dog[] dogs = {new Dog(), new Dog()};
        Cat[] cats = {new Cat(), new Cat()};
        printConsult(dogs);
        printConsult(cats);


    }

    private static void printConsult(Animal[] animals) {
        System.out.println("-----------------");
        for (Animal animal : animals) {
            animal.consult();
        }
        animals[1] = new Cat(); /*Não irá funcionar pq ele nao sabe que tipo de animal vc quer inserir*/
    }
}
