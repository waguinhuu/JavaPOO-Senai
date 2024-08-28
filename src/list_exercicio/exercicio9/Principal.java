package list_exercicio.exercicio9;


public class Principal {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Wagner", "719834626", "wagner@gmail.com", Sexo.MASCULINO, EstadoCivil.SOLTEIRO, "05/06/2005", 13,
                new Endereco("Drena 1", "93", "nao sei", "43900-000", "SFC", UnidadeFederativa.BAHIA));

        PrestacaoServico prestacaoServico = new PrestacaoServico("Luana","7198234543","luana@gmail.com",
                new Endereco("Drena II","93","nulo","43900-000","SFC",UnidadeFederativa.SAO_PAULO),"12345-44","cee","02/01/2024","09/06/2034");

        Fornecedor fornecedor = new Fornecedor("Marta","739735243","Marta@gmal.com",
                new Endereco("Sao Bento","99","nuull","48900-000","Pindamonhagaba",UnidadeFederativa.BAHIA),"34563-33","377hh","Manga");

        Medico medico = new Medico("Paulo","713424422","paulo@gmail.com",
                new Endereco("Pitangueira","88","Apartamento","45800-000","Saramandaia",UnidadeFederativa.RIO_DE_JANEIRO),Sexo.MASCULINO,EstadoCivil.VIUVO,"23/09/1998","123.456.789-00","363646",Setor.SAUDE,13900,"123");

        Advogado advogado = new Advogado("Marcio","713424422","marcio@gmail.com",
                new Endereco("Rua B","88","nulo","45800-000","Saramandaia",UnidadeFederativa.RIO_DE_JANEIRO),Sexo.MASCULINO,EstadoCivil.VIUVO,"23/09/1998","123.456.789-00","363646",Setor.ENGENHARIA,13900,"naosei");

        Engenheiro engenheiro = new Engenheiro("Luisa","719827272","lusia@gmail.com",
                new Endereco("macaco","23","casa","45800-000","Saramandaia",UnidadeFederativa.BAHIA),Sexo.FEMININO,EstadoCivil.CASADO,"23/09/1998","345.678.444-23","363646",Setor.JURIDICO,13900,"443ff");

        System.out.println(cliente);
        System.out.println(prestacaoServico);
        System.out.println(fornecedor);
        System.out.println(medico);
        System.out.println(advogado);
        System.out.println(engenheiro);
    }
}
