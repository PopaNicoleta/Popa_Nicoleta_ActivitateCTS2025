package D16_Chain_Of_Responsability.main;

import D16_Chain_Of_Responsability.clase.Cont;
import D16_Chain_Of_Responsability.clase.ContCurent;
import D16_Chain_Of_Responsability.clase.ContDebit;
import D16_Chain_Of_Responsability.clase.ContEconomii;

public class Main {
    public static void main(String[] args) {

        Cont contCredit = new ContDebit(200);
        Cont contEconomii = new ContEconomii(300);
        Cont contCurent = new ContCurent(500);

        contCurent.setUrmatorul(contCredit);
        contCredit.setUrmatorul(contEconomii);

        contCurent.plateste(600);
    }
}
