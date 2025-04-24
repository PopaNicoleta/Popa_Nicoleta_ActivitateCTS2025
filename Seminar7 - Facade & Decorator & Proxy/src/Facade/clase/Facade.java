package Facade.clase;

public class Facade {

    public String verificaAsezareMasa(Masa masa){
        Picolo picolo = new Picolo();
        Ospatar ospatar = new Ospatar();

        if(masa.isEsteLibera()){
            if(picolo.debaraseaza(masa)){
                if(ospatar.esteAranjata(masa)){
                   return "Puteti lua loc la masa cu numarul " + masa.getNrMasa() + ".";
                } else{
                    return "Asteptati putin pentru a putea fi aranjata masa!";
                }
            } else{
                return "Asteptati! Tocmai s-a ridicat cineva!";
            }
        } else {
            return "Ne pare rau! Nu avem locuri libere!";
        }
    }
}
