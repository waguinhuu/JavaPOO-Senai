package list_exercicio.exercicio6;

public class Engenheiro extends Funcionario {
    private String crea;

    public Engenheiro(String nome, String cpf, String rg, double salario, String crea) {
        super(nome, cpf, rg, salario);
        this.crea = crea;
    }

    @Override
    public String toString() {
        return "\nEngenheiro " +
                super.toString() +
                "\nCrea = " + crea;
    }
}
