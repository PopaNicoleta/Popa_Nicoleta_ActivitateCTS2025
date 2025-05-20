package E6_Facade.clase;

public class VerificaFacade {
    public void verificaClient(Client client, String numeDePeBilet){
        Antecedente antecedente = new Antecedente();
        Cazier cazier = new Cazier();
        if(client.verificaBuletin(numeDePeBilet)){
            System.out.println("Biletul apartine clientului " + client.getNume());
            if(!cazier.esteCautataDepolitie(client)){
                System.out.println("Nu este cautat de politie");
                if(!antecedente.areAntecedente(client)){
                    System.out.println("Nu are antecendente! Totul este in regula!");
                } else{
                    System.out.println("Are antecedente pe alte stadioane! Nu il putem lasa inauntru!");
                }
            } else{
                System.out.println("Este cautat de politie");
            }
        } else{
            System.out.println("Numele de pe buletin si bilet nu corespund!");
        }
    }
}
