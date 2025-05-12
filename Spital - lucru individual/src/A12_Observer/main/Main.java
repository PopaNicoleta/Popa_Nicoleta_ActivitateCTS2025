package A12_Observer.main;

import A12_Observer.observer.Observer;
import A12_Observer.observer.Pacient;
import A12_Observer.subiect.Spital;
import A12_Observer.subiect.Subiect;


public class Main {
    public static void main(String[] args){
        Subiect spital = new Spital("Floreasca");

        Observer pacient1 = new Pacient("Popa", "Maria");
        Observer pacient2 = new Pacient("Marinescu", "Theodora");
        Observer pacient3 = new Pacient("Marin", "Camelia");
        Observer pacient4 = new Pacient("Tudose", "Constantin");

        spital.adaugaAbonat(pacient1);
        spital.adaugaAbonat(pacient2);
        spital.adaugaAbonat(pacient3);
        spital.adaugaAbonat(pacient4);
        spital.eliminaAbonat(pacient1);

        spital.trimiteNotificare("a aparut un nou virus!");


    }
}
