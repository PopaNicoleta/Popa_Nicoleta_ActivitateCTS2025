package D2_Factory_Method.factories;

import D2_Factory_Method.clase.Client;

public interface IFactory {
    public Client creazaClient(String nume, String adresa, String dataSemnareContract, int valoareExtra);
}
