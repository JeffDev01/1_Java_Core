package intermediate.Dgenerics.test;


import java.util.List;

public class BWildCardTest02 {
    public static void main(String[] args) {
        List<Animal> dogs = List.of(new Dog(), new Dog());
        List<Animal> cats = List.of(new Cat(), new Cat());

        printConsult(dogs);
        printConsult(cats);

    }

    private static void printConsult(List<? extends Animal> animals) {
        System.out.println("-----------------");
        for (Animal animal : animals) {
            animal.consult();
        }
    }


    private static void printConsultDo(List<? super Dog> animals) {
        System.out.println("-----------------");
        for (Object obj : animals) {
            if (obj instanceof Dog) {
                Dog d = (Dog) obj;
                d.consult();
            }
        }
    }
}
