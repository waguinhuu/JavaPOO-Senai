package list_exercicio.computador;

public class DispositivoDeArmazenamento  extends Marcas {
    private String capacidadeDeArmazenamento;
    private String tipoDeConexao;

    public DispositivoDeArmazenamento(String marca, String modelo, String capacidadeDeArmazenamento, String tipoDeConexao) {
        super(marca, modelo);
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
        this.tipoDeConexao = tipoDeConexao;
    }

    public String getCapacidadeDeArmazenamento() {
        return capacidadeDeArmazenamento;
    }

    public void setCapacidadeDeArmazenamento(String capacidadeDeArmazenamento) {
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }

    public String getTipoDeConexao() {
        return tipoDeConexao;
    }

    public void setTipoDeConexao(String tipoDeConexao) {
        this.tipoDeConexao = tipoDeConexao;
    }
}
