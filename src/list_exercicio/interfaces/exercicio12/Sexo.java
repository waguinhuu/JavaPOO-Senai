package list_exercicio.interfaces.exercicio12;

public enum Sexo {
    MASCULINO("Masculino"),
    FEMNINO("Feminino");

    String texto;

    Sexo(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
