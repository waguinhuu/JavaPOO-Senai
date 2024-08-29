package list_exercicio.interfaces.exercicio13;

public enum Setor {
    ENGENHARIA("Engenharia"),
    RECURSOS_HUMANOS("Recursos Humanos"),
    JURIDICO("Jurídico"),
    MARKETING("Marketing"),
    OPERACOES("Operações");

    String nome;

    Setor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
