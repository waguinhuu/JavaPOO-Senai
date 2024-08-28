package list_exercicio.componentes_pc;

public class Principal {
    public static void main(String[] args) {
        Memoria memoria = new Memoria("Kingston","DD4",16);
        Processador processador = new Processador("Intel","I5",3200);

        System.out.println(memoria);
        System.out.println(processador);
    }
}
