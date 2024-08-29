package list_exercicio.interfaces.exercicio13;

public class Principal {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Wagner","123.456.789-00","34543",
                new Endereco("Drena","93","nn sei","43900-000","SFC",UnidadeFederativa.BAHIA),Setor.MARKETING,Sexo.MASCULINO,3000,"05/06/2005",Bonificacao.GERENTE);

        Diretor diretor = new Diretor("Wagner","123.456.789-00","34543",
                new Endereco("Drena","93","nn sei","43900-000","SFC",UnidadeFederativa.BAHIA),Setor.MARKETING,Sexo.MASCULINO,3000,"05/06/2005",Bonificacao.DIRETOR);
       System.out.println(gerente);

        System.out.println(diretor);
        diretor.demitir(diretor);

    }


}
