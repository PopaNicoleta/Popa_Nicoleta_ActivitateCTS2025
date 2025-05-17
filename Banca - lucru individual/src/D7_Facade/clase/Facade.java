package D7_Facade.clase;

public class Facade {
    public Facade() {
    }

    public void creazaCont(Persoana persoana){
        if(persoana.getVarsta() >= 18){
            System.out.println(persoana.getNume() + " are varsta legala de a-si putea deschide un cont!");
            if(!persoana.esteUrmaritDePolitie()){
                System.out.println(persoana.getNume() + " nu este urmarit de politie!");
                if(!persoana.areCreanteLaAlteBanci()){
                    System.out.println(persoana.getNume() + " este eligibil sa isi creeze un cont bancar!");
                } else{
                    System.out.println(persoana.getNume() + " ARE creante la alte banci!");
                }
            } else{
                System.out.println(persoana.getNume() + " ESTE urmarit de politie!");
            }
        } else{
            System.out.println(persoana.getNume() + " NU are varsta legala de a-si putea deschide un cont!");

        }
    }
}
