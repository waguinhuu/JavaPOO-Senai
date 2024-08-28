package java_senai;

public class PrincipalViC {
    public static void main(String[] args) {
        Veiculo carro = new Veiculo("TTTT-333", "Preto", 4, 20, 250);
        Cliente cliente = new Cliente("Wagner", 19, "123.456.789-00", "Algum lugar", "(71)912345678");

        System.out.println(cliente);
        System.out.println(carro);
        System.out.println("Consumo médio do veiculo: " + carro.getConsumoMedio());
    }
}
