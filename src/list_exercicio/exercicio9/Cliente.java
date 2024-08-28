package list_exercicio.exercicio9;



public class Cliente extends Fisica {
    private int protocoloDeAtendimento;

    public Cliente(String nome, String telefone, String email, Sexo sexo, EstadoCivil estadoCivil, String dataNascimento, int protocoloDeAtendimento, Endereco endereco ) {
        super(nome, telefone, email, endereco, sexo, estadoCivil, dataNascimento);
        this.protocoloDeAtendimento = protocoloDeAtendimento;
    }

    @Override
    public String toString() {
        return "Cliente: " +
                super.toString() +
                "\n ProtocoloDeAtendimento = " + protocoloDeAtendimento;
    }
}
