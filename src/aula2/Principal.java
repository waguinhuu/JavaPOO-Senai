package aula2;

public class Principal {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Drena1", 93, "SFC");
        Cliente cliente1 = new Cliente("Wagner", 19, endereco);

        System.out.println(cliente1);
    }
}
