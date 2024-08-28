package list_exercicio.computador;



public class Principal {
    public static void main(String[] args) {
        Processador processador = new Processador("Intel", "i5","2.4-Ghz");
        PlacaMae placaMae = new PlacaMae("Aorus","B550M","AM4");
        Memoria memoria = new Memoria("Kingston","SODIMM",16,"DDR4-3200hz");
        DispositivoDeArmazenamento armazenamento = new DispositivoDeArmazenamento("Samsung","SSD","1-TeraByte","SATA");

        System.out.println("Dados do processaodor");
        System.out.println("Marca: " + processador.getMarca());
        System.out.println("Modelo: " + processador.getModelo());
        System.out.println("Frequência: " + processador.getFrequencia());

        System.out.println("\nDados da placa mãe");
        System.out.println("Marca: " + placaMae.getMarca());
        System.out.println("Modelo: " + placaMae.getModelo());
        System.out.println("Soquete: " + placaMae.getSoquete());

        System.out.println("\nDados da memória");
        System.out.println("Marca: " + memoria.getMarca());
        System.out.println("Modelo: " + memoria.getModelo());
        System.out.println("Capacidade de armazenamento: " + memoria.getCapacidadeDeArmazenamento());
        System.out.println("Tipo de conexão: " + memoria.getFrequencia());

        System.out.println("\nDados do armazenamento");
        System.out.println("Marca: " + armazenamento.getMarca());
        System.out.println("Modelo: " + armazenamento.getModelo());
        System.out.println("Capacidade de armazenamento: " + armazenamento.getCapacidadeDeArmazenamento());
        System.out.println("Tipo de conexão: " + armazenamento.getTipoDeConexao());
    }
}
