package ro.cts.seminar2.clase;

public abstract class Aplicant{
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int nr_proiecte;
	protected String[] denumireProiect;
	private static final int PRAG_ACCEPTARE = 80;

	public Aplicant() {
		super();
	}

	public Aplicant(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.nr_proiecte = nr_proiecte;
		this.denumireProiect = denumireProiect;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public int getPunctaj() {
		return punctaj;
	}

	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}

	public void afiseazaRezultatAplicant() {
		System.out.println(getRezultatAplicant());
	}

	private String getRezultatAplicant() {
		return "Aplicantul " + nume + " " + prenume + (punctaj > PRAG_ACCEPTARE ? " a fost acceptat." : " nu a fost acceptat.");
	}


	public int getNrProiecte() {
		return nr_proiecte;
	}

	public void setNrProiecte(int nr_proiecte,String[] denumireProiect) {
		this.denumireProiect = denumireProiect;
		this.nr_proiecte = nr_proiecte;
	}

	public abstract void afiseazaFinantarePrimita();
}
