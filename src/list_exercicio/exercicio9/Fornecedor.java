package list_exercicio.exercicio9;

public class Fornecedor extends Juridica {
    private String produto;

    public Fornecedor(String nome, String telefone, String email, Endereco endereco, String cnpj, String inscricaoEstadual, String produto) {
        super(nome, telefone, email, endereco, cnpj, inscricaoEstadual);
        this.produto = produto;
    }

    @Override
    public String toString() {
        return " \nFornecedor: " +
                super.toString() +
                "\nProduto = " + produto;
    }
}
