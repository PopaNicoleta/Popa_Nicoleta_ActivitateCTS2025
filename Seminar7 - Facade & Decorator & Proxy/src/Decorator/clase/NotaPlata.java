package Decorator.clase;

public class NotaPlata implements Nota {
    private float total;

    public NotaPlata(float total) {
        this.total = total;
    }

    public float getTotal() {
        return total;
    }

    @Override
    public void printeaza() {
        System.out.println("Totalul notei de plata este de " + this.total + " de lei.");
    }
}
