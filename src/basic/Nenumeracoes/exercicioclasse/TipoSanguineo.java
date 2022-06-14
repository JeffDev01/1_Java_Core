package basic.Nenumeracoes.exercicioclasse;

public enum TipoSanguineo {

    A_POSITIVO(1), A_NEGATIVO(2), O_POSITO(3), O_NEGATIVO(4);

    private final int numeroTipo;

    TipoSanguineo(int numeroTipo) {
        this.numeroTipo = numeroTipo;
    }

    public int getNumeroTipo() {
        return numeroTipo;
    }

}
