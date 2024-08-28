package list_exercicio.cliente_funcionario;

public class PrincicpalCF {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Thiago", 19,"Rua A", "(71)98345737","05/06/2005","Cartao de credito");
        Funcionario funcionario = new Funcionario("Wagner", 19, "Rua A", "(71)982632532","0303LL","Professor",3400);

        System.out.println("Dados do cliente");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Endereço: " + cliente.getEndereco());
        System.out.println("Telefone: " + cliente.getTelefone());

        System.out.println("\nDados do funcionário");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Endereço: " + funcionario.getEndereco());
        System.out.println("Telefone: " + funcionario.getTelefone());



    }
}
