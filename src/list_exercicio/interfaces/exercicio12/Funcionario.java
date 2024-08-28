package list_exercicio.interfaces.exercicio12;

public abstract class Funcionario {

    protected String nome;
    protected String dataNascimento;
    protected Sexo sexo;
    protected Setor setor;
    protected double salarioBase;

    public Funcionario(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.setor = setor;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public abstract double getSalarioFinal();

    @Override
    public String toString() {
        return
                "\n Nome = " + nome +
                "\n DataNascimento = " + dataNascimento +
                "\n Sexo = " + sexo.getTexto() +
                "\n Setor = " + setor.getNome() +
                "\n SalarioBase = " + salarioBase;
    }
}
