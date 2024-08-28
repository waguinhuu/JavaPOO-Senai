package list_exercicio.exercicio7;

public class Juridica extends Pessoa{
    private String cnpj;
    private String inscricaoEstadual;

    public Juridica(String nome, String telefone, String email, Endereco endereco, String cnpj, String inscricaoEstadual) {
        super(nome, telefone, email, endereco);
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
