package main;

import SimpleFactory.factory.FactoryAMasina;
import SimpleFactory.factory.TipMasina;
import Singleton.clase.AMasina;
import Singleton.clase.Masina;
import Singleton.clase.Service;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        AMasina masina1 = new Masina("Volkswagen", "Bora", "OT 80 NYK", 2001);
        Service service1 = Service.getInstance("MotoRepair", "Strada Valea Cascadelor, Nr. 3", 5, masina1);
        service1.afiseazaDetalii();

        AMasina masina2 = new Masina("Volkwagen", "Passat", "OT 70 MYK", 2007);
        service1.setMasina(masina2);
        service1.afiseazaDetalii();

        AMasina masina3 = new Masina("Volkwagen", "Golf 3", "OT 03 WVM", 1995);
        service1.setMasina(masina3);
        service1.afiseazaDetalii();

        AMasina masina4 = new Masina("Volkswagen", "Jetta", "OT 16 KMI", 2010);
        service1.setMasina(masina4);
        service1.afiseazaDetalii();

        System.out.println("\n");

        FactoryAMasina factory = new FactoryAMasina();
        AMasina sedan = factory.creazaMasina(TipMasina.Sedan, "Renaut", "Megane", "OT 97 MRK", 2016);
        System.out.println(sedan.toString());

        AMasina suv = factory.creazaMasina(TipMasina.SUV, "Jeep", "X", "OT 65 MAS", 2020);
        System.out.println(suv.toString());
        
    }
}