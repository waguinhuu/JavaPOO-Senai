package java_senai;

import java.util.Locale;

public class MetodosString {
    public static void main(String[] args) {
        String nome = "Marta";
        String sobrenome = "Silveira";

        // Exibindo a quantidade de caracteres
        System.out.println("Tamanho do nome: " + nome.length());
        System.out.println("Tamanho do sobenome: "+ sobrenome.length());

        // Concatenando nome + sobrenome
        String nomeCompleto = nome.concat(" ").concat(sobrenome);

        // Exibindo nome completo usando métodos Strings - Maiúsculas
        System.out.println("Concatenação Maíuscula: " + nomeCompleto.toUpperCase());

        // Exibindo nome completo usando métodos Strings - Minúsculas
        System.out.println("Concatenação Minúscula: " + nomeCompleto.toLowerCase());
    }
}
