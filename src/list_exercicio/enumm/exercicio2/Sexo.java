package list_exercicio.enumm.exercicio2;

public enum Sexo {
    MASCULINO("Masculino"),
    FEMININO("Feminino");

    String genero;

    Sexo(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }
}
