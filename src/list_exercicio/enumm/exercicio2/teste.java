package list_exercicio.enumm.exercicio2;

import java.time.LocalDate;

public class teste {
    public static void main(String[] args) {
        LocalDate dia = LocalDate.now();
        System.out.println(dia);

        LocalDate diaEspecifico = LocalDate.of(2005, 6, 5);
        System.out.println(diaEspecifico);
    }
}
