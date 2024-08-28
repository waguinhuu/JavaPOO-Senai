package list_exercicio.interfaces.exercicio12;

public class Principal {
    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("Wagner","05/06/2005",Sexo.MASCULINO,Setor.FINANCEIRO,3900,"A");
        Diretor diretor = new Diretor("Marta","05/02/1976",Sexo.FEMNINO,Setor.RECURSOS_HUMANOS,3000);

        System.out.println(motoboy);

        System.out.println(diretor);
        diretor.demitir(diretor);
        diretor.admitir(diretor);
    }
}
