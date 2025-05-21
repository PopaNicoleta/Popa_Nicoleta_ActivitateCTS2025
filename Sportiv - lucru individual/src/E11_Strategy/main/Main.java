package E11_Strategy.main;

import E11_Strategy.clase.*;

public class Main {
    public static void main(String[] args) {
        Spectator spectator1 = new Spectator("Maria");
        Spectator spectator2 = new Spectator("Liviu");
        Spectator spectator3 = new Spectator("Carmen");

        Verifica verificaVIP = new VerificaBilet();
        Verifica verificaTribuna = new VerificaBagaje();
        Verifica verificaPeluza = new VerificaBagajeBilet();

        spectator1.setModVerificare(verificaVIP);
        spectator1.verificare();

        System.out.println("");
        spectator2.setModVerificare(verificaTribuna);
        spectator3.verificare();


        System.out.println("");
        spectator3.setModVerificare(verificaPeluza);
        spectator3.verificare();
    }
}
