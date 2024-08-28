package list_exercicio.exercicio5;

public class Juridica extends Pessoa {
    private String cnpj;
    private String inscricaoEstadual;

    public Juridica(String nome, int idade, String cnpj, String inscricaoEstadual) {
        super(nome, idade);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    @Override
    public String toString() {
        return "\nPessoa Juridica: " +
                super.toString() +
                "\n Cnpj = " + cnpj +
                "\n InscricaoEstadual = " + inscricaoEstadual;
    }
}
