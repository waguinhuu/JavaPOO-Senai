package list_exercicio.enumm.exercicio4;

public class Principal {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario(123,"Wagner","123.456.789-00","863732","234442","05/06/2005",
                Sexo.MASCULINO,Setor.ENGENHARIA,2300,"7198245837","Wagner@gmail.com",
                new Endereco("Drena",93,"sla","43900-000","SFC",UnidadeFederativa.BAHIA));

        System.out.println(funcionario);
    }

}
