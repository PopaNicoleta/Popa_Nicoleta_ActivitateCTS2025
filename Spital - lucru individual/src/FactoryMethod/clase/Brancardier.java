package FactoryMethod.clase;

public class Brancardier extends PersonalSpital{
    public Brancardier(String nume, int varsta, double salariu) {
        super(nume, varsta, salariu);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Brancardierul " + getNume() + ", in varsta de " + getVarsta() + " ani, are salariul de " + getSalariu() + " lei.");

    }
}

