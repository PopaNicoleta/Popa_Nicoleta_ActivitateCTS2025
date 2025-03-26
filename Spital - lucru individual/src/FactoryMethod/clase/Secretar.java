package FactoryMethod.clase;

public class Secretar extends  PersonalSpital {

    public Secretar(String nume, int varsta, double salariu) {
        super(nume, varsta, salariu);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Secretarul " + getNume() + ", in varsta de " + getVarsta() + " ani, are salariul de " + getSalariu() + " lei.");

    }

}
