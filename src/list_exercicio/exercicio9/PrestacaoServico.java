package list_exercicio.exercicio9;

public class PrestacaoServico extends Juridica {
    private String contratoInicio;
    private String contratoFim;

    public PrestacaoServico(String nome, String telefone, String email, Endereco endereco, String cnpj, String inscricaoEstadual, String contratoInicio, String contratoFim) {
        super(nome, telefone, email, endereco, cnpj, inscricaoEstadual);
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
