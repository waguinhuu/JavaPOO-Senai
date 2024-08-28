package aula2;

public class PrincipalBanco {
    public static void main(String[] args) {
        ContaBancaria banco = new ContaBancaria("Santander", "sla", 0000, "Corrente", 3000, 4000);
        FuncionarioB funiconario = new FuncionarioB(123,"Wagner","sla","(71)12373","sla@gmail.com", banco);

        System.out.println(funiconario);
    }
}
