package teste;

import categorii.CategorieCorrect;
import categorii.CategorieRightBicep;
import clase.IPersoana;
import clase.PachetTuristic;
import clase.Persoana;
import dubluri.PersoanaFake;
import dubluri.PersoanaStub;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class AplicaDiscountTests {

    @Test
    @Category(CategorieRightBicep.class)
    public void aplicaDiscountVarstniciBoundryStub() {
        IPersoana persoana = new PersoanaStub();
        PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Tenerife", 2000.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(1800.0, pachetTuristic.getPret(), 0.01);
    }

    @Test
    @Category(CategorieRightBicep.class)
    public void aplicaDiscountVarstniciRightFake() {
        PersoanaFake persoana = new PersoanaFake();
        persoana.setVarsta(80);

        PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Tenerife", 2000.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(1800.0, pachetTuristic.getPret(), 0.01);
    }

    @Test
    @Category(CategorieCorrect.class)
    public void aplicaDiscountVarstniciRangeFake() {
        PersoanaFake persoana = new PersoanaFake();
        persoana.setVarsta(18);

        PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Tenerife", 2000.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(2000.0, pachetTuristic.getPret(), 0.01);
    }
}