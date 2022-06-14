package intermediate.Dgenerics.domain;

public class Car implements Veiculo {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void descricaoVeiculo() {
        System.out.println("The car goes through roads and highways");
    }
}
