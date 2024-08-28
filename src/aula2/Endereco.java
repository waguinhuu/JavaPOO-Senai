package aula2;

public class Endereco {
    private String lodgadouro;
    private int numero;
    private String cidade;

    public Endereco(String lodgadouro, int numero, String cidade) {
        this.lodgadouro = lodgadouro;
        this.numero = numero;
        this.cidade = cidade;
    }

    public String getLodgadouro() {
        return lodgadouro;
    }

    public void setLodgadouro(String lodgadouro) {
        this.lodgadouro = lodgadouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "lodgadouro='" + lodgadouro + '\'' +
                ", numero=" + numero +
                ", cidade='" + cidade + '\'' +
                '}';
    }
}
