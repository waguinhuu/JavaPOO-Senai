package list_exercicio.cliente_funcionario;

public class Cliente extends Pessoa {
    private String dataDaCompra;
    private String formaDePagamento;

    public Cliente(String nome, int idade, String endereco, String telefone, String dataDaCompra, String formaDePagamento) {
        super(nome, idade, endereco, telefone);
        this.dataDaCompra = dataDaCompra;
        this.formaDePagamento = formaDePagamento;
    }

    public String getDataDaCompra() {
        return dataDaCompra;
    }

    public void setDataDaCompra(String dataDaCompra) {
        this.dataDaCompra = dataDaCompra;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }


}
