package list_exercicio.enumm.exercicio4;

public enum Sexo {
    MASCULINO('M',"Masculino"),
    FEMININO('F',"Feminino");

    char caractere;
    String texto;

    Sexo(char caractere, String texto) {
        this.caractere = caractere;
        this.texto = texto;
    }

    public char getCaractere() {
        return caractere;
    }

    public String getTexto() {
        return texto;
    }
}
