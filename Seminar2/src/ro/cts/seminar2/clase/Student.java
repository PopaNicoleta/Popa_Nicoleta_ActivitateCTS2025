package ro.cts.seminar2.clase;

import java.util.Arrays;

import static ro.cts.seminar2.finantari.ConstanteFinantare.SUMA_FINANTARE_STUDENT;

public class Student extends Aplicant {
	protected String facultate;
	protected int anStudii;

	public Student() {
		super();
	}

	public Student(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiect, String facultate, int anStudii) {
		super(nume, prenume, varsta, punctaj, nrProiecte, denumireProiect, SUMA_FINANTARE_STUDENT);
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

}
