package list_exercicio.exercicio9;

public abstract class Funcionario extends Fisica{
    protected String cpf;
    protected String rg;
    protected Setor setor;
    protected double salario;

    public Funcionario(String nome, String telefone, String email, Endereco endereco, Sexo sexo, EstadoCivil estadoCivil, String dataNascimento, String cpf, String rg, Setor setor, double salario) {
        super(nome, telefone, email, endereco, sexo, estadoCivil, dataNascimento);
        this.cpf = cpf;
        this.rg = rg;
        this.setor = setor;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n Cpf = " + cpf +
                "\n Rg = " + rg +
                "\n Setor =  " + setor.getNome() +
                "\n Salario = " + salario;

    }
}
