package intermediate.Dgenerics.domain;

public class Boat implements Veiculo{
    private String name;

    public Boat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Boat{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void descricaoVeiculo() {
        System.out.println("The boat goes throgh  water");
    }
}
