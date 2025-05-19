package C14_Template.clase;

public class GestiuneMedicamente extends GestiuneMedicamenteTemplate{
    @Override
    protected void primesteReteta(Reteta reteta) {
        System.out.println("Rețeta #" + reteta.getNumarReteta() + " a fost primită.");
    }

    @Override
    protected boolean verificaStoc(Reteta reteta) {
        System.out.println("Se verifică stocul...");
        return true;
    }

    @Override
    protected void aduceMedicamente(Reteta reteta) {
        System.out.println("Se aduc medicamentele din depozit.");
    }

    @Override
    protected void incaseaza(Reteta reteta) {
        System.out.println("Se încasează suma de " + reteta.getSumaDePlata() + " lei.");
    }

    @Override
    protected void scadeDinStoc(Reteta reteta) {
        System.out.println("Se scade medicamentele din stoc.");
    }

    @Override
    protected void emiteBon(Reteta reteta) {
        System.out.println("Bon emis pentru rețeta #" + reteta.getNumarReteta());
    }
}
