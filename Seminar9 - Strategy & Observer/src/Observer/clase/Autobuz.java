package Observer.clase;

public class Autobuz extends MijlocTransport{
    public Autobuz(int nrLinie) {
        super(nrLinie);
    }
    @Override
    public void anuntaPlecare() {
        trimiteNotificare("Autobuzul cu numarul " + super.getNrLinie() + " a plecat de la capatul de linie.");
    }

    public void schimbareRuta(){
        trimiteNotificare("Autobuzul cu numarul " + super.getNrLinie() + " va circula pe Bulevadrul Balcescu si nu va traversa Piata Romana.");
    }
}
