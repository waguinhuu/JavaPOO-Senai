package list_exercicio.exercicio5;

public class Principal {
    public static void main(String[] args) {
        Fisica fisica = new Fisica("Wagner",19,"123.456.789-00","2333","05/06/2005");
        Juridica juridica = new Juridica("Thiago",19,"23656","sla");

        System.out.println(fisica);
        System.out.println(juridica);
    }
}
