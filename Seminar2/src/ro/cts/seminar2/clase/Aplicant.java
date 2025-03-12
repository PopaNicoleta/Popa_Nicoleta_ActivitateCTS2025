package ro.cts.seminar2.clase;
import java.util.Arrays;

public abstract class Aplicant{
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int nrProiecte;
	protected String[] denumireProiect;
	protected float sumaFinantata;

	public Aplicant() {
		super();
	}

	public Aplicant(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiect, float sumaFinantata) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.nrProiecte = nrProiecte;
		this.denumireProiect = denumireProiect;
		this.sumaFinantata = sumaFinantata;
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

	public int getNrProiecte() {
		return nrProiecte;
	}

	public void setNrProiecte(int nr_proiecte,String[] denumireProiect) {
		this.denumireProiect = denumireProiect;
		this.nrProiecte = nr_proiecte;
	}

	public float getSumaFinantata() {
		return sumaFinantata;
	}

	@Override
	public String toString() {
		return "Nume=" + nume + ", Prenume=" + prenume + ", Varsta=" + varsta +
				", Punctaj=" + punctaj + ", NrProiecte=" + nrProiecte +
				", DenumireProiect=" + Arrays.toString(denumireProiect);
	}

}
