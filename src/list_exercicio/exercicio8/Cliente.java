package list_exercicio.exercicio8;

public class Cliente  extends Fisica{
    private String protocoloDeAtendimento;

    public Cliente(String nome, String telefone, String email, Sexo sexo, EstadoCivil estadoCivil, String dataNascimento, String protocoloDeAtendimento,Endereco endereco ) {
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
