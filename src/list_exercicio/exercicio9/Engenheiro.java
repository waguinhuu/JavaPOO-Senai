package list_exercicio.exercicio9;

public class Engenheiro extends Funcionario{
    private String crea;

    public Engenheiro(String nome, String telefone, String email, Endereco endereco, Sexo sexo, EstadoCivil estadoCivil, String dataNascimento, String cpf, String rg, Setor setor, double salario, String crea) {
        super(nome, telefone, email, endereco, sexo, estadoCivil, dataNascimento, cpf, rg, setor, salario);
        this.crea = crea;
    }

    @Override
    public String toString() {
        return "\nEngenheiro: " +
                super.toString() +
                "\nCrea = " + crea;
    }
}
