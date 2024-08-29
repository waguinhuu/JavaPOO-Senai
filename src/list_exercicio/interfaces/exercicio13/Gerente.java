package list_exercicio.interfaces.exercicio13;

public class Gerente extends CargoDeConfianca{

    public Gerente(String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String data_nascimento, Bonificacao bonificacao) {
        super(nome, cpf, rg, endereco, setor, sexo, salario, data_nascimento, bonificacao);
    }

    @Override
    public double getSalarioFinal() {
        double salarioFinal = super.salario * super.bonificacao.GERENTE.getValor();
        salarioFinal += super.salario;
        //salarioFinal += super.salario * bonificacao.GERENTE.getValor();
        return salarioFinal;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                super.toString() +
                "\nbonificacao = " + bonificacao.getValor() + "% ";
    }
}
