package list_exercicio.interfaces.exercicio13;

public class Motorista extends Funcionario{
    private String carteiraDeHabilitacao;

    public Motorista(String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String data_nascimento, String carteiraDeHabilitacao) {
        super(nome, cpf, rg, endereco, setor, sexo, salario, data_nascimento);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    @Override
    public double getSalarioFinal() {
        return 0;
    }

    @Override
    public String toString() {
        return " \nMotorista: " +
                super.toString() +
                "\nCarteiraDeHabilitacao = " + carteiraDeHabilitacao ;
    }
}
