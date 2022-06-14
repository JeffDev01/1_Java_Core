package basic.Nenumeracoes.classes;

public class Cliente {

    public enum TipoPagamento{
        AVISTA, APRAZO;

    }
    private TipoPagamento tipoPagamento;
    private String nome;
    private TipoCliente tipoCliente;

    public Cliente(String nome, TipoCliente tipo, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipo;
        this.tipoPagamento = tipoPagamento;
    }

    public Cliente() {
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipo=" + tipoCliente.getNome() +
                ", tipoPagamento="+tipoPagamento+
                ", numero-="+tipoCliente.getTipo()+
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}
