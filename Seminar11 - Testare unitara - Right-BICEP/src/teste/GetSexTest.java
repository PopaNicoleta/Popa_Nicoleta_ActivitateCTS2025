package teste;

import clase.Persoana;
import static org.junit.Assert.*;

import exceptii.ExceptieCNPInvalid;
import org.junit.Before;
import org.junit.Test;

public class GetSexTest {

    @Test
    public void getSexRight() {
        Persoana persoana = new Persoana("Maria", "6041212345674");
        assertEquals("F", persoana.getSex());
    }

    @Test
    public void getSexRight1() {
        Persoana persoana = new Persoana("Marius", "5041212345674");
        assertEquals("M", persoana.getSex());
    }

    @Test
    public void getSexBoundaryInferior(){
        Persoana persoana = new Persoana("Marius", "1761212345674");
        assertEquals("M", persoana.getSex());
    }

    @Test
    public void getSexBoundarySuperior(){
        Persoana persoana = new Persoana("Ana", "8761212345674");
        assertEquals("F", persoana.getSex());
    }

    private String getSexParity(String cnp){
        return cnp.charAt(0) % 2 == 0 ? "F" : "M";
    }

    @Test
    public void getSexCrossCheck(){
        String CNP = "8761212345674";
        Persoana persoana = new Persoana("Ana", CNP);
        assertEquals(getSexParity(CNP), persoana.getSex());
    }

    @Test(expected = ExceptieCNPInvalid.class)
    public void getSexError(){
        Persoana persoana = new Persoana("Ion", "9761212345674");
        persoana.getSex();
    }

    @Test(timeout = 100)
    public void getSexPerformance(){
        Persoana persoana = new Persoana("Ana", "8761212345674");
        persoana.getSex();
    }
}