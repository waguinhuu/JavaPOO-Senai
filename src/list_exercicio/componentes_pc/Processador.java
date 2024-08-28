package list_exercicio.componentes_pc;

import list_exercicio.computador.Marcas;

public class Processador extends Marcas {
    private float frequencia;

    public Processador(String marca, String modelo, float frequencia) {
        super(marca, modelo);
        this.frequencia = frequencia;
    }

    public float getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(float frequencia) {
        this.frequencia = frequencia;
    }

    @Override
    public String toString() {
        return "Processador{" +
                "frequencia=" + frequencia +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
