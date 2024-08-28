package list_exercicio.enumm.exercicio1;

public class Principal {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(2199,"Wagner",19,2300,Setor.RECURSOS_HUMANOS, Sexo.MASCULINO);

        System.out.println("Dados do funcionário");
        System.out.println("ID: " + funcionario.getId());
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Idade: " + funcionario.getIdade());
        System.out.println("Salário: " + funcionario.getSalario());
        System.out.println("Setor: " + funcionario.getSetor().getNome());
        System.out.println("Sexo: " + funcionario.getGenero().getTexto());
    }
}
