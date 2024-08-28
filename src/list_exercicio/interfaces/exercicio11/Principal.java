package list_exercicio.interfaces.exercicio11;

public class Principal {
    public static void main(String[] args) {
        Soma soma = new Soma();
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao = new Divisao();
        Subtracao subtracao = new Subtracao();


        System.out.println(soma.calcular(5, 5));
        System.out.println(multiplicacao.calcular(5, 5));
        System.out.println(divisao.calcular(5, 5));
        System.out.println(subtracao.calcular(5, 5));
    }
}
