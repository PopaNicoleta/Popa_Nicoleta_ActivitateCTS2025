package ro.cts.seminar2.clase;

import java.util.Arrays;

import static ro.cts.seminar2.finantari.ConstanteFinantare.SUMA_FINANTARE_ELEV;

public class Elev extends Aplicant{

	private int clasa;
	private String tutore;

	public Elev() {
		super();
	}

	public Elev(String nume, String prenume, int varsta, int punctaj,
				int nrProiecte, String[] denumireProiect, int clasa, String tutore) {
		super(nume,prenume,varsta,punctaj,nrProiecte,denumireProiect, SUMA_FINANTARE_ELEV);
		this.clasa = clasa;
		this.tutore = tutore;
	}

	public int getClasa() {
		return clasa;
	}

	public void setClasa(int clasa) {
		this.clasa = clasa;
	}

	public String getTutore() {
		return tutore;
	}

	public void setTutore(String tutore) {
		this.tutore = tutore;
	}

	@Override
	public float getSumaFinantata() {
		return 30;
	}


	@Override
	public String toString() {
		return "Elev: " + super.toString() + ", Clasa=" + clasa + ", Tutore=" + tutore;
	}
}
