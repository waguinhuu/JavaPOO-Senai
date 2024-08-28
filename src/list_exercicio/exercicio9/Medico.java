package list_exercicio.exercicio9;

public class Medico extends Funcionario{
    private String crm;

    public Medico(String nome, String telefone, String email, Endereco endereco, Sexo sexo, EstadoCivil estadoCivil, String dataNascimento, String cpf, String rg, Setor setor, double salario, String crm) {
        super(nome, telefone, email, endereco, sexo, estadoCivil, dataNascimento, cpf, rg, setor, salario);
        this.crm = crm;
    }

    @Override
    public String toString() {
        return "\nMedico: " +
                super.toString() +
                "\nCrm = " + crm;
    }
}
