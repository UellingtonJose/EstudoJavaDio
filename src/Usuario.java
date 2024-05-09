// Arquivo Usuario.java
public class Usuario {
    public static void main(String[] args) throws Exception {
        // Criando uma instância de SmartTv
        SmartTv smartTv = new SmartTv();

        // Reduzindo o volume três vezes
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        // Aumentando o volume uma vez
        smartTv.aumentarVolume();       

        // Imprimindo o volume atual
        System.out.println("Volume Atual ? " + smartTv.volume);
        
        System.out.println("Canal Atual ? " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal Atual ? " + smartTv.canal);


        // Interagindo com a SmartTv
        System.out.println("TV Ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual ? " + smartTv.canal);
        System.out.println("Volume Atual ? " + smartTv.volume);
        

        // Imprimindo o volume atual
        //System.out.println("Volume Atual: " + smartTv.volume);

        // Ligando a SmartTv
        smartTv.ligar ();
        System.out.println("Novo status TV Ligada ? " + smartTv.ligada);

        // Desligando a SmartTv
        smartTv.desligar();
        System.out.println("Novo status TV Ligada? " + smartTv.ligada);
    }
}
