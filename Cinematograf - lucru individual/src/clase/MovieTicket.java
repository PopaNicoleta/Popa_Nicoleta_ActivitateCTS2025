package clase;

import java.util.Arrays;

public class MovieTicket implements Ticket {
    private String numeFilm;
    private String numeRegieFilm;
    private String numeActoriPrincipali;
    private String reclame;
    private String data;
    private String ora;
    private int locOcupat;

    public MovieTicket() {
        this.numeFilm = "Frumoasa si bestia";
        this.numeRegieFilm = "Mark Smith";
        this.numeActoriPrincipali = "Justin, Anna";
        this.reclame = "plasare produse";
    }

    public MovieTicket(String numeFilm, String numeRegieFilm, String numeActoriPrincipali, String reclame, String data, String ora, int locOcupat) {
        this.numeFilm = numeFilm;
        this.numeRegieFilm = numeRegieFilm;
        this.numeActoriPrincipali = numeActoriPrincipali;
        this.reclame = reclame;
        this.data = data;
        this.ora = ora;
        this.locOcupat = locOcupat;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setOra(String ora) {
        this.ora = ora;
    }

    public void setLocOcupat(int locOcupat) {
        this.locOcupat = locOcupat;
    }

    @Override
    public Ticket clone(String data, String ora, int locOcupat) {
        MovieTicket ticket = new MovieTicket(this.numeFilm, this.numeRegieFilm, this.numeActoriPrincipali, this.reclame, data, ora, locOcupat);
        return ticket;
    }

    @Override
    public void afisareDescriere() {
        System.out.println(new StringBuilder("Bilet -> ").
                append("nume film '").append(numeFilm).append('\'')
                .append(", nume regie film '").append(numeRegieFilm).append('\'')
                .append(", nume actori principali: ").append(numeActoriPrincipali)
                .append(", reclame: '").append(reclame).append('\'')
                .append(", data: '").append(data).append('\'')
                .append(", ora: '").append(ora).append('\'')
                .append(", locuriOcupate: ").append(locOcupat));
    }
}