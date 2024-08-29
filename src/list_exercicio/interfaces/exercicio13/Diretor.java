package list_exercicio.interfaces.exercicio13;

public class Diretor extends CargoDeConfianca implements Contratacao{

    private final double PREMIO = 0.5;


    public Diretor(String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String data_nascimento, Bonificacao bonificacao) {
        super(nome, cpf, rg, endereco, setor, sexo, salario, data_nascimento, bonificacao);
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("====Admitindo o diretor====");
        System.out.println("===Dados do diretor===");
        System.out.println(funcionario.toString());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("====Demitido o diretor====");
        System.out.println("===Dados do diretor===");
        System.out.println(funcionario.toString());
    }

    @Override
    public double getSalarioFinal() {
        double salarioFinal = 0;
         salarioFinal = (super.salario * super.bonificacao.DIRETOR.getValor()) + (super.salario * PREMIO);
        salarioFinal += super.salario;
        return salarioFinal;
    }

    @Override
    public String toString() {
        return "\nDiretor: " +
                super.toString() +
                "\nPREMIO=" + PREMIO;
    }
}
