package java_senai;

public class PrincipalF {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Wagner", 18, 2500f);

//        funcionario.setNome("Wagner");
//        funcionario.setIdade(18);
//        funcionario.setSalario(2500f);

        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Idade: " + funcionario.getIdade());
        System.out.println("Funcionario: " + funcionario.getSalario());
    }
}
