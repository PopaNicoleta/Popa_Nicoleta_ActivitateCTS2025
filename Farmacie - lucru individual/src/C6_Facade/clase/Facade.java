package C6_Facade.clase;

public class Facade {
    private Client client;
    private Reteta reteta;
    private Medicament medicament;

    public Facade(Client client, Reteta reteta, Medicament medicament) {
        this.client = client;
        this.reteta = reteta;
        this.medicament = medicament;
    }

    public void cumparaMedicament(int nrReteta) {
        if(this.reteta.verificaReteta(nrReteta)) {
            if(medicament.verificaStoc(reteta.getCantitate())){
                if(client.verificaCardSanatate()){
                    System.out.println("Achizitie reusita!");
                }
                else{
                    System.out.println("Card de sanaate invalid!");
                }
            } else{
                System.out.println("Stoc insuficient!");
            }
        } else{
            System.out.println("Reteta invalida!");
        }

    }
}
