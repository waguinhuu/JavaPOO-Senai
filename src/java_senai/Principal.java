package java_senai;

public class Principal {
    public static void main(String[] args) {
        Clientes cliente = new Clientes();

        // cliente.nome = "Wagner";
       // cliente.idade = 18;
        cliente.setNome("Wagner");
        cliente.setIdade(18);

        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());
    }
}
