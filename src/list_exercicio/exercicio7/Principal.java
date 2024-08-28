package list_exercicio.exercicio7;

public class Principal {
    public static void main(String[] args) {
        Fisica pessoaFisica = new Fisica("Wagner","719834748","wagne@gmail",
                new Endereco("Drena",93,"sla","43900-000","SFC",UnidadeFederativa.BAHIA),"123.456.789-00","123","05/06/2005",Sexo.MASCULINO);
        Juridica juridica =  new Juridica("Wagner","719834748","fernanda@gmail.com",
                new Endereco("Drena II",23,"nn sei","43900-00","STA",UnidadeFederativa.RIO_DE_JANEIRO),"4352522-44","sla");

        System.out.println(pessoaFisica);
        System.out.println(juridica);
    }
}
