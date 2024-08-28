package list_exercicio.exercicio6;

public class Medico extends Funcionario{
    private String crm;

    public Medico(String nome, String cpf, String rg, double salario, String crm) {
        super(nome, cpf, rg, salario);
        this.crm = crm;
    }

    @Override
    public String toString() {
        return "\nMedico: " +
                super.toString() +
                "\nCrm = " + crm;
    }
}
