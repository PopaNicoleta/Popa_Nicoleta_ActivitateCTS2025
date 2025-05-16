package Chain_Of_Responsability.main;

import Chain_Of_Responsability.clase.*;

public class Main {
    public static void main(String[] args) {
        MijlocDeTransport troleibuz = new Troleibuz();
        MijlocDeTransport autobuz = new Autobuz();
        MijlocDeTransport tramvai = new Tramvai();
        MijlocDeTransport metrou = new Metrou();

        troleibuz.setUrmatorul(autobuz);
        autobuz.setUrmatorul(tramvai);
        tramvai.setUrmatorul(metrou);

        //troleibuz.recomanda(6);
        troleibuz.recomanda(11);
        //troleibuz.recomanda(1);
    }
}