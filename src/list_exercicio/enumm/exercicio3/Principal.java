package list_exercicio.enumm.exercicio3;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        Fisica wagner = new Fisica("Wagner", "(71)982334654", "123.456.789-00", "13332324",
                LocalDate.of(2005, 9, 5));

        System.out.println(wagner);


    }
}
