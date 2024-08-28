package list_exercicio.exercicio8;

public class PrestacaoServico extends Juridica{
    private String contratoInicio;
    private String contratoFim;

    public PrestacaoServico(String nome, String telefone, String email, String cnpj, String inscricaoEstadual, Endereco endereco, String contratoInicio, String contratoFim) {
        super(nome, telefone, email, cnpj, inscricaoEstadual, endereco);
        this.contratoInicio = contratoInicio;
        this.contratoFim = contratoFim;
    }

    @Override
    public String toString() {
        return "\n PrestacaoServico: " +
                super.toString() +
                " \nContratoInicio = " + contratoInicio +
                " \ncontratoFim =  " + contratoFim;
    }
}
