package list_exercicio.exercicio8;

public abstract class Juridica extends Pessoa{
    protected String cnpj;
    protected String inscricaoEstadual;

    public Juridica(String nome, String telefone, String email, String cnpj, String inscricaoEstadual,Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "\nJuridica: " +
                super.toString() +
                "\n Cnpj = " + cnpj +
                "\n InscricaoEstadual = " + inscricaoEstadual;
    }
}
