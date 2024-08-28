package java_senai;

public class ComparacaoTipos {
    public static void main(String[] args) {
        String nomeUsuario = "Marta";
        int senha = 123;

        boolean resultadoNome = nomeUsuario.equals("Marta");
        boolean resultadoSenha = (senha == 456);

        System.out.println("O nome do usuário esta correto? " + resultadoNome);
        System.out.println("A Senha esta correta? " + resultadoSenha);
    }
}
