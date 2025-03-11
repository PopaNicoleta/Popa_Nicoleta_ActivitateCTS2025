package ro.cts.seminar2.clase;

import java.util.Arrays;

public class Student extends Aplicant {
	protected String facultate;
	protected int anStudii;
	private static float sumaFinantata = 20;

	public Student() {
		super();
	}

	public Student(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiect, String facultate, int anStudii) {
		super(nume, prenume, varsta, punctaj, nrProiecte, denumireProiect);
		this.facultate = facultate;
		this.anStudii = anStudii;
	}

	public String getFacultate() {
		return facultate;
	}

	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}

	public int getAnStudii() {

		return anStudii;
	}

	public void setAnStudii(int anStudii) {
		this.anStudii = anStudii;
	}

	@Override
	public String toString() {
		return "Student: " + super.toString() + ", Facultate=" + facultate + ", AnStudii=" + anStudii;
	}

	@Override
	public void afiseazaFinantarePrimita() {
		System.out.println("Studentul " + getNume() + " " + getPrenume() + " primeste"+sumaFinantata+" Euro/zi in proiect.");

	}
	
}
