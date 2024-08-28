package list_exercicio.interfaces.exercicio12;

public class Motoboy extends Funcionario{
    private String carteiraHabilitacao;

    public Motoboy(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase, String carteiraHabilitacao) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
        this.carteiraHabilitacao = carteiraHabilitacao;
    }

    @Override
    public double getSalarioFinal() {
        return super.salarioBase;
    }

    @Override
    public String toString() {
        return "\nMotoboy: " +
                super.toString() +
                "\nCarteira de Habilitação = " + carteiraHabilitacao +
                "\nSalario final = " + getSalarioFinal();
    }
}
