package list_exercicio.interfaces.exercicio13;

public abstract class Funcionario implements SalarioFinal{
    protected String nome;
    protected String cpf;
    protected String rg;
    protected Endereco endereco;
    protected Setor setor;
    protected Sexo sexo;
    protected double salario;
    protected String data_nascimento;

    public Funcionario(String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String data_nascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.setor = setor;
        this.sexo = sexo;
        this.salario = salario;
        this.data_nascimento = data_nascimento;
    }

    @Override
    public double getSalarioFinal() {
        return 0;
    }

    @Override
    public String toString() {
        return
                "\nNome = " + nome +
                "\nCpf = " + cpf +
                "\nRG = " + rg +
                "\nData de nascimento = " + data_nascimento +
                "\nSexo = " + sexo.getTexto() +
                "\nSetor = " + setor.getNome() +
                "\nSalario = " + salario +
                "\nSalario Final = " + getSalarioFinal() +
                "\nEndereco = " + endereco;
    }
}
