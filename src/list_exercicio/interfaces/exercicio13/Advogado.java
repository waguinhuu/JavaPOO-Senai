package list_exercicio.interfaces.exercicio13;

public class Advogado extends Funcionario{
    private String oab;

    public Advogado(String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String data_nascimento, String oab) {
        super(nome, cpf, rg, endereco, setor, sexo, salario, data_nascimento);
        this.oab = oab;
    }

    @Override
    public double getSalarioFinal() {
        return 0;
    }

    @Override
    public String toString() {
        return "\nAdvogado: " +
                super.toString() +
                "\nOAB = " + oab;
    }
}
