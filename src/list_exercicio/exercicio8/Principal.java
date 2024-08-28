package list_exercicio.exercicio8;

public class Principal {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Wagner","719834637","Wagner@gmail.com",Sexo.MASCULINO,EstadoCivil.SOLTEIRO,"05/06/2005","naosei",
                new Endereco("Drena 1","93","nn sei","43900-000","SFC",UnidadeFederativa.BAHIA));


        PrestacaoServico prestacaoServico = new PrestacaoServico("Wagner","71983457837","wagner@gmail.com","1234-44","sla",
                new Endereco("Drena II", "34","null","43900-000,","São Francisco do Conde",UnidadeFederativa.BAHIA),"05/06/2024","05/06/2027");


        System.out.println(cliente);
        System.out.println(prestacaoServico);
    }
}
