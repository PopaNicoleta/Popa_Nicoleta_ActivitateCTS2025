package Chain_Of_Responsability.clase;

public class Troleibuz extends MijlocDeTransport{
    @Override
    public void recomanda(int distanta) {
        if(distanta < 3){
            System.out.println("Poti lua troleibuzul!");
        }
        else{
            super.getUrmatorul().recomanda(distanta);
        }
    }
}
