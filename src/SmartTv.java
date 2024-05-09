public class SmartTv {
    // Atributos da SmartTv
    boolean ligada = false; // Indica se a TV está ligada ou desligada
    int canal = 1; // Canal atual da TV
    int volume = 25; // Volume atual da TV

    // Método para mudar o canal da TV para um novo valor
    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    // Método para aumentar o canal da TV
    public void aumentarCanal() {
        canal++;
    }

    // Método para diminuir o canal da TV
    public void diminuirCanal() {
        canal--;
    }

    // Método para aumentar o volume da TV
    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    // Método para diminuir o volume da TV
    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    // Método para ligar a TV
    public void ligar() {
        ligada = true;
    }

    // Método para desligar a TV
    public void desligar() {
        ligada = false;
    }
}
