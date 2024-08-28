package aula2;

public class ContaBancaria {
    private String banco;
    private String agencia;
    private int numeroDaConta;
    private String tipoConta;
    private double saldoAtual;
    private double limiteDisponivel;

    public ContaBancaria(String banco, String agencia, int numeroDaConta, String tipoConta, double saldoAtual, double limiteDisponivel) {
        this.banco = banco;
        this.agencia = agencia;
        this.numeroDaConta = numeroDaConta;
        this.tipoConta = tipoConta;
        this.saldoAtual = saldoAtual;
        this.limiteDisponivel = limiteDisponivel;

        System.out.println((saldoAtual > limiteDisponivel) ? "Limite nao disponivel para o saldo." : " ");

    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(double saldoAtual) {

        this.saldoAtual = saldoAtual;
    }

    public double getLimiteDisponivel() {
        return limiteDisponivel;
    }

    public void setLimiteDisponivel(double limiteDisponivel) {
        this.limiteDisponivel = limiteDisponivel;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "banco='" + banco + '\'' +
                ", agencia='" + agencia + '\'' +
                ", numeroDaConta=" + numeroDaConta +
                ", tipoConta='" + tipoConta + '\'' +
                ", saldoAtual=" + saldoAtual +
                ", limiteDisponivel=" + limiteDisponivel +
                '}';
    }
}
