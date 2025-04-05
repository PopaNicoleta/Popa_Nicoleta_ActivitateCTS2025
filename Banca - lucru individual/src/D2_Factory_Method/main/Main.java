package D2_Factory_Method.main;


import D2_Factory_Method.clase.Client;
import D2_Factory_Method.factories.FactoryClientPersFizica;
import D2_Factory_Method.factories.FactoryClientPersJuridica;
import D2_Factory_Method.factories.IFactory;

public class Main {
    public static void main(String[] args) {

        FactoryClientPersFizica factoryClientPersFizica = new FactoryClientPersFizica();
        Client persFizica = factoryClientPersFizica.creazaClient("Mariana", "Str. Mihai Eminescu, Nr. 1", "20-02-2024", 30);
        System.out.println(persFizica.toString());

        FactoryClientPersJuridica  factoryClientPersJuridica = new FactoryClientPersJuridica();
        Client persJuridica = factoryClientPersJuridica.creazaClient("OMV Petrol", "Str. Aviatorilor, Nr. 123", "12-01-2003", 324242);
        System.out.println(persJuridica.toString());
    }
}