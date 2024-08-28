package list_exercicio.exercicio6;

public class Motoboy  extends Funcionario {
    private String cnh;

    public Motoboy(String nome, String cpf, String rg, double salario, String cnh) {
        super(nome, cpf, rg, salario);
        this.cnh = cnh;
    }

    @Override
    public String toString() {
        return "\nMotoboy: " +
                super.toString() +
                "\nCnh = " + cnh;
    }
}
