package list_exercicio.exercicio6;

public abstract class  Funcionario {
    protected String nome;
    protected String cpf;
    protected String rg;
    protected double salario;

    public Funcionario(String nome, String cpf, String rg, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.salario = salario;
    }

    @Override
    public String toString() {

        return "\nNome = " + nome +
                "\nCpf = " + cpf +
                "\nRg = " + rg +
                "\nSalario = " + salario ;
    }
}
