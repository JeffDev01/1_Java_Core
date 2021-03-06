package basic.Imodificadorestatico.classes;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    public static double velocidadeLimite = 220;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Carro() {
    }

    //Setters and Getters para modificar valor static
    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static  double getVelocidadeLimite(){
        return  velocidadeLimite;
    }



    public void imprime(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Velocidade maxima: "+this.velocidadeMaxima);
        System.out.println("Velocidade limite: "+velocidadeLimite);
        System.out.println("-------------------------");

    }







    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }


}
