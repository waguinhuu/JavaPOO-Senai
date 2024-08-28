package list_exercicio.exercicio9;

public class Endereco {

    protected String logadouro;
    protected String numero;
    protected String complemento;
    protected String cep;
    protected String cidade;
    protected UnidadeFederativa uf;

    public Endereco(String logadouro, String numero, String complemento, String cep, String cidade, UnidadeFederativa uf) {
        this.logadouro = logadouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "\nEndereço: " +
                "\n Logadouro = " + logadouro +
                "\n Numero = " + numero +
                "\n Complemento = " + complemento +
                "\n Cep = " + cep +
                "\n Cidade = " + cidade +
                "\n Uf = " + uf.getNome() + "/" + uf.getSigla();
    }
}
