package aula2;

public class ClienteP {
    private String nome;
    private int idade;
    private Pet pet;
    private Endereco endereco;

    public ClienteP(String nome, int idade, Pet pet) {
        this.nome = nome;
        this.idade = idade;
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "ClienteP{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", pet=" + pet +
                '}';
    }
}
