package list_exercicio.interfaces.exercicio13;

public enum Bonificacao {
    GERENTE(0.35),
    DIRETOR(0.45);

    double valor;

    Bonificacao(double valor) {
        this.valor = valor;
    }
    public double getValor() {
        return valor;
    }
}
