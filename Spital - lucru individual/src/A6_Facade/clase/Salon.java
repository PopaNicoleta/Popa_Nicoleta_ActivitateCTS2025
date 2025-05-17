package A6_Facade.clase;

import java.util.List;

public class Salon {
    private List<Integer> paturiLibere;
    private List<Integer> paturiOcupate;

    public Salon(List<Integer> paturiLibere,  List<Integer> paturiOcupate) {
        this.paturiLibere = paturiLibere;
        this.paturiOcupate = paturiOcupate;
    }

    public List<Integer> getPaturiLibere() {
        return paturiLibere;
    }

    public List<Integer> getPaturiOcupate() {
        return paturiOcupate;
    }

    public boolean verificaDisponibilitatePat(int nrPat){
        if(this.paturiLibere.contains(nrPat)){
            return true;
        } else if(this.paturiOcupate.contains(nrPat)){
            return false;

        } else{
            return false;
        }
    }
}
