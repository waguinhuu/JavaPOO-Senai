package list_exercicio.interfaces.exercicio12;

public class Diretor extends Funcionario implements Contratacao{
    private final double PREMIO = 0.2;

    public Diretor(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
    }

    @Override
    public double getSalarioFinal() {
        double salarioFinal = super.salarioBase * PREMIO;
        salarioFinal += super.salarioBase;
        return salarioFinal;
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.printf("\nO funcionario %s foi admitido", getNome());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.printf("\nO funcionario %s foi demitido", getNome());
    }

    @Override
    public String toString() {
        return "\nDiretor: " +
                super.toString() +
                "\nPrêmio = " + PREMIO +
                "\nSalario final = " + getSalarioFinal();

    }
}
