package list_exercicio.exercicio7;

public abstract class Pessoa {
    protected String nome;
    protected String telefone;
    protected String email;
    protected Endereco endereco;

    public Pessoa(String nome, String telefone, String email, Endereco endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return
                "\n Nome = " + nome +
                "\n Telefone = " + telefone +
                "\n Email = " + email + endereco ;
    }
}
