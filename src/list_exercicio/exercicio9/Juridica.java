package list_exercicio.exercicio9;

public abstract class Juridica extends Pessoa {
    protected String cnpj;
    protected String inscricaoEstadual;

    public Juridica(String nome, String telefone, String email, Endereco endereco, String cnpj, String inscricaoEstadual) {
        super(nome, telefone, email, endereco);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    @Override
    public String toString() {
        return
                super.toString() +
                "\n Cnpj = " + cnpj +
                "\n InscricaoEstadual = " + inscricaoEstadual;
    }
}
