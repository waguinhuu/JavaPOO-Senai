package list_exercicio.exercicio7;

public class Fisica extends Pessoa {
    private String cpf;
    private String rg;
    private String dataNascimento;
    private Sexo sexo;

    public Fisica(String nome, String telefone, String email, Endereco endereco, String cpf, String rg, String dataNascimento, Sexo sexo) {
        super(nome, telefone, email, endereco);
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa Fisica: " +
                super.toString() +
                "\n CPF -> " + cpf +
                "\n RG -> " + rg +
                "\n Sexo -> " + sexo.getTexto() +
                "\n Data de Nascimento -> " + dataNascimento;
    }
}
