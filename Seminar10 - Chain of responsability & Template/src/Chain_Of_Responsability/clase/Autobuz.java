package Chain_Of_Responsability.clase;

public class Autobuz extends MijlocDeTransport{

    @Override
    public void recomanda(int distanta) {
        if(distanta >= 3 && distanta < 5){
            System.out.println("Poti lua autobuzul!");
        }
        else{
            super.getUrmatorul().recomanda(distanta);
        }
    }
}
