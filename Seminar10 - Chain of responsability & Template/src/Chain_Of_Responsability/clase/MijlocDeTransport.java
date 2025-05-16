package Chain_Of_Responsability.clase;

public abstract class MijlocDeTransport {
    protected MijlocDeTransport urmatorul;

    public MijlocDeTransport getUrmatorul() {
        return urmatorul;
    }

    public void setUrmatorul(MijlocDeTransport urmatorul) {
        this.urmatorul = urmatorul;
    }

    public abstract void recomanda(int distanta);
}
