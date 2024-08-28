package list_exercicio.enumm.exercicio2;

public class Principal {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Wagner",19,"78028273232","wg@gmail",Sexo.MASCULINO,
                new Endereco("Drena",93,"SLA","4390000","sfc",UnidadeFederativa.BAHIA));

        System.out.println(pessoa);
    }
}
