package D2_Factory_Method.factories;

import D2_Factory_Method.clase.Client;
import D2_Factory_Method.clase.ClientPersoanaJuridica;

public class FactoryClientPersJuridica implements IFactory{
    @Override
    public Client creazaClient(String nume, String adresa, String dataSemnareContract, int codCAEN) {
        return new ClientPersoanaJuridica(nume, adresa, dataSemnareContract, codCAEN);
    }
}
