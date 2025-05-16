package Chain_Of_Responsability.clase;

public class Tramvai extends MijlocDeTransport{
    @Override
    public void recomanda(int distanta) {
        if( distanta >= 5 && distanta < 10){
            System.out.println("Poti lua tramvaiul!");
        }
        else{
            super.getUrmatorul().recomanda(distanta);
        }
    }
}
