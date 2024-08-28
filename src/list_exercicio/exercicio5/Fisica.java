package list_exercicio.exercicio5;

public class Fisica extends Pessoa {
    private String cpf;
    private String rg;
    private String dataNascimento;

    public Fisica(String nome, int idade, String cpf, String rg, String dataNascimento) {
        super(nome, idade);
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Pessoa Fisica: " +
                super.toString() +
                "\n CPF -> " + cpf +
                "\n RG -> " + rg +
                "\n Data de Nascimento -> " + dataNascimento;
    }
}
