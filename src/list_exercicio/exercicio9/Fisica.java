package list_exercicio.exercicio9;


public abstract class Fisica extends Pessoa {
    protected Sexo sexo;
    protected EstadoCivil estadoCivil;
    protected String dataNascimento;

    public Fisica(String nome, String telefone, String email, Endereco endereco, Sexo sexo, EstadoCivil estadoCivil, String dataNascimento) {
        super(nome, telefone, email, endereco);
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\n Sexo = " + sexo.getTexto() +
                "\n EstadoCivil = " + estadoCivil.getTexto() +
                "\n DataNascimento = " + dataNascimento;
    }
}
