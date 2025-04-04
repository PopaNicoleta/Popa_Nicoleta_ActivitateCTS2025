package clase;

public interface Ticket {
    public Ticket clone(String data, String ora, int locOcupat);
    public void afisareDescriere();
}