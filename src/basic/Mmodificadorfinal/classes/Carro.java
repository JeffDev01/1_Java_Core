package basic.Mmodificadorfinal.classes;


public class Carro {

    private static final double VELOCIDADE_FINAL = 220;
    private final Comprador comprador = new Comprador();
    private String nome;
    private String marca;


    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }


    public Comprador getComprador() {
        return comprador;
    }

    public static double getVelocidadeFinal() {
        return VELOCIDADE_FINAL;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
