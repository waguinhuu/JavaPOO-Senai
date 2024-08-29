package list_exercicio.interfaces.exercicio13;

public abstract class CargoDeConfianca extends Funcionario{
    protected Bonificacao bonificacao;

    public CargoDeConfianca(String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String data_nascimento, Bonificacao bonificacao) {
        super(nome, cpf, rg, endereco, setor, sexo, salario, data_nascimento);
        this.bonificacao = bonificacao;
    }
}
