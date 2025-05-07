package E10_Flyweight.clase;

public class Persoana implements Flyweight {
    private int rand;
    private String culoareTricou;

    public Persoana(int rand, String culoareTricou) {
        this.rand = rand;
        this.culoareTricou = culoareTricou;
    }

    public int getRand() {
        return rand;
    }

    public void setRand(int rand) {
        this.rand = rand;
    }

    public String getCuloareTricou() {
        return culoareTricou;
    }

    public void setCuloareTricou(String culoareTricou) {
        this.culoareTricou = culoareTricou;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persoana -> ");
        sb.append("rand: ").append(rand);
        sb.append(", culoare tricou: ").append(culoareTricou);
        return sb.toString();
    }

    @Override
    public void deseneaza(Caracteristici caracteristici) {
        System.out.println(this.toString() + caracteristici.toString());
    }
}
