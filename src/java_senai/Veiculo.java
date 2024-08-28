package java_senai;

public class Veiculo {
    private String placa;
    private String cor;
    private int numeroDePassageiros;
    private int capadidadeDoTanque;
    private int velocidadeMax;
    private double consumoMedio;

    public Veiculo(String placa, String cor, int numeroDePassageiros, int capadidadeDoTanque, int velocidadeMax) {
        this.placa = placa;
        this.cor = cor;
        this.numeroDePassageiros = numeroDePassageiros;
        this.capadidadeDoTanque = capadidadeDoTanque;
        this.velocidadeMax = velocidadeMax;
    }

    public int getCapadidadeDoTanque() {
        return capadidadeDoTanque;
    }

    public void setCapadidadeDoTanque(int capadidadeDoTanque) {
        this.capadidadeDoTanque = capadidadeDoTanque;
    }

    public int getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(int velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public double getConsumoMedio() {
        return (double) getVelocidadeMax() / getCapadidadeDoTanque();
    }

    public void setConsumoMedio(double consumoMedio) {
        this.consumoMedio = consumoMedio;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "\nplaca='" + placa +
                ", \ncor='" + cor +
                ", \nnumeroDePassageiros=" + numeroDePassageiros +
                ", \ncapadidadeDoTanque=" + capadidadeDoTanque +
                ",\n velocidadeMax=" + velocidadeMax +
                '}';
    }
}
