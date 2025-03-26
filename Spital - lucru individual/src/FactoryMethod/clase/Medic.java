package FactoryMethod.clase;

public class Medic extends PersonalSpital {
    public Medic(String nume, int varsta, double salariu) {
        super(nume, varsta, salariu);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Medicul " + getNume() + ", in varsta de " + getVarsta() + " ani, are salariul de " + getSalariu() + " lei.");

    }
}

