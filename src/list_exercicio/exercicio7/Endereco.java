package list_exercicio.exercicio7;

public class Endereco {
    private String logadouro;
    private int numero;
    private String complemento;
    private String cep;
    private String cidade;
    private UnidadeFederativa uf;

    public Endereco(String logadouro, int numero, String complemento, String cep, String cidade, UnidadeFederativa uf) {
        this.logadouro = logadouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.uf = uf;
    }


    @Override
    public String toString() {
        return " \n Endereço: " +
                "\n Logadouro = " + logadouro +
                "\n Número = " + numero +
                "\n Complemento = " + complemento +
                "\n Cep = " + cep +
                "\n Cidade = " + cidade +
                "\n UF = " + uf.getNome() + "/" + uf.getSigla();
    }
}
