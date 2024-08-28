package list_exercicio.interfaces.exemplo;

public class Principal {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();


        System.out.println(cachorro.emitirSom());
        System.out.println(gato.emitirSom());
    }
}
