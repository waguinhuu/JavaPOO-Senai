package list_exercicio.exercicio6;

public class Principal {
    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("Wagner","123.456.789-00","123",4500,"234");
        Medico medico = new Medico("Luis","345.678.977-98","55677",8900,"sla");
        Engenheiro engenheiro = new Engenheiro("Marta","987.888.333-11","3636",7899,"nn sei");

        System.out.println(motoboy);
        System.out.println(medico);
        System.out.println(engenheiro);
    }
}
