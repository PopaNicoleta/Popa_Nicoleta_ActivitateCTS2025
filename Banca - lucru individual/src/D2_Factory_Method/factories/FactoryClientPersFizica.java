package D2_Factory_Method.factories;

import D2_Factory_Method.clase.Client;
import D2_Factory_Method.clase.ClientPersoanaFizica;

public class FactoryClientPersFizica implements IFactory {
    @Override
    public Client creazaClient(String nume, String adresa, String dataSemnareContract, int varsta) {
        return new ClientPersoanaFizica(nume, adresa, dataSemnareContract, varsta);
    }
}
