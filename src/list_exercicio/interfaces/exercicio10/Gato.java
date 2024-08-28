package list_exercicio.interfaces.exercicio10;


public class Gato implements Animal {

    @Override
    public String emitirSom() {
        return "Miau!";
    }

    @Override
    public String comer() {
        return "ração";
    }
}
