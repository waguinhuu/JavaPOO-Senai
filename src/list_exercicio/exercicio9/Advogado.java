package list_exercicio.exercicio9;

public class Advogado extends Funcionario{
    private String cab;

    public Advogado(String nome, String telefone, String email, Endereco endereco, Sexo sexo, EstadoCivil estadoCivil, String dataNascimento, String cpf, String rg, Setor setor, double salario, String cab) {
        super(nome, telefone, email, endereco, sexo, estadoCivil, dataNascimento, cpf, rg, setor, salario);
        this.cab = cab;
    }

    @Override
    public String toString() {
        return "\nAdvogado: " +
                super.toString() +
                "\nCab = " + cab;
    }
}
