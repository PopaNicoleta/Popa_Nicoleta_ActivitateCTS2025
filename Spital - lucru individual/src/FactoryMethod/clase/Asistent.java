package FactoryMethod.clase;

public class Asistent extends PersonalSpital{

    public Asistent(String nume, int varsta, double salariu) {
        super(nume, varsta, salariu);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Asistentul " + getNume() + ", in varsta de " + getVarsta() + ", ani are salariul de " + getSalariu() + " lei.");
    }
}
