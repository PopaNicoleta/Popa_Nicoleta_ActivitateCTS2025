package C14_Template.clase;

public abstract class GestiuneMedicamenteTemplate {
    public final void achizitioneaza(Reteta reteta) {
        primesteReteta(reteta);
        if (verificaStoc(reteta)) {
            aduceMedicamente(reteta);
            incaseaza(reteta);
            scadeDinStoc(reteta);
            emiteBon(reteta);
        } else {
            System.out.println("Stoc insuficient. Achiziția este anulată.");
        }
    }

    protected abstract void primesteReteta(Reteta reteta);

    protected abstract boolean verificaStoc(Reteta reteta);

    protected abstract void aduceMedicamente(Reteta reteta);

    protected abstract void incaseaza(Reteta reteta);

    protected abstract void scadeDinStoc(Reteta reteta);

    protected abstract void emiteBon(Reteta reteta);
}


