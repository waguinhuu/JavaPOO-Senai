package list_exercicio.computador;

public class Memoria extends Marcas {
    private double capacidadeDeArmazenamento;
    private String frequencia;

    public Memoria(String marca, String modelo, double capacidadeDeArmazenamento, String frequencia) {
        super(marca, modelo);
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
        this.frequencia = frequencia;
    }

    public double getCapacidadeDeArmazenamento() {
        return capacidadeDeArmazenamento;
    }

    public void setCapacidadeDeArmazenamento(double capacidadeDeArmazenamento) {
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }
}
