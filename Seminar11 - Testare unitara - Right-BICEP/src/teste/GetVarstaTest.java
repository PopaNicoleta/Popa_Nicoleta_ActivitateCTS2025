package teste;

import categorii.CategorieCorrect;
import categorii.CategorieRightBicep;
import clase.IPersoana;
import clase.Persoana;
import static org.junit.Assert.*;

import exceptii.ExceptieCNPInexistent;
import exceptii.ExceptieCNPInvalid;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class GetVarstaTest {
    Persoana persoana;

    @Before
    public void setUp() throws Exception {
        persoana = new Persoana();
    }

    @Test
    public void getVarstaRight() {
        persoana = new Persoana("Maria", "6050101287647");
        assertEquals(20, persoana.getVarsta());
    }

    @Test
    public void getVarstaRight2() {
        persoana = new Persoana("Marcel", "1560101287647");
        assertEquals(69, persoana.getVarsta());
    }

    @Test
    public void getVarstaBoundarySuperior(){
        persoana = new Persoana("Ana", "2991231457685");
        assertEquals(25, persoana.getVarsta());
    }

    @Test
    public void getVarstaBoundaryInferior(){
        persoana = new Persoana("Ana", "6000101457685");
        assertEquals(25, persoana.getVarsta());
    }

    @Test(expected = ExceptieCNPInvalid.class)
    public void getVarstaError(){
        persoana = new Persoana("Maria", "62A4830495721");
        persoana.getVarsta();
    }

    @Test(expected = ExceptieCNPInvalid.class)
    public void getVarstaEroareLuna(){
        persoana = new Persoana("Marius", "5031419234567");
        persoana.getVarsta();
    }

    @Test(timeout = 100)
    public void getVarstaPerformanta(){
        persoana = new Persoana("Ana", "2991231457685");
        persoana.getVarsta();
    }

    @Test(expected = ExceptieCNPInexistent.class)
    public void getVarstaNulla(){
        persoana = new Persoana("Maria", null);
        persoana.getVarsta();
    }

    @Test
    public void getVarstaCardinality(){
        persoana = new Persoana("Ana", "5240101131415");
        assertEquals(1, persoana.getVarsta());
    }

    public void getVarstaCardinality0(){
        persoana = new Persoana("Ana", "5250101131415");
        assertEquals(0, persoana.getVarsta());

    }

    @Category({CategorieCorrect.class, CategorieRightBicep.class})
    public void getVarstaOrder(){
        IPersoana persoana1 = new Persoana("Maria", "2991231349786");
        IPersoana persoana2 = new Persoana("Marius", "5000101576849");

        assertTrue(persoana1.getVarsta() > persoana2.getVarsta());
        assertEquals(true, persoana1.getVarsta() > persoana2.getVarsta());
    }
}