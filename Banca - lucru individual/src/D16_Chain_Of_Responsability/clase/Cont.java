package D16_Chain_Of_Responsability.clase;

public abstract class Cont {
    private Cont urmatorul;
    private double sold;

    public Cont(double sold) {
        this.sold = sold;
    }

    public double getSold() {
        return sold;
    }

    public void setUrmatorul(Cont urmatorul) {
        this.urmatorul = urmatorul;
    }

    public Cont getUrmatorul() {
        return urmatorul;
    }

    public abstract void plateste(double suma);
}
