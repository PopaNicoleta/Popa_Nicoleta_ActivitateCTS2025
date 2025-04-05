package D1_Simple_Factory.factory;

import D1_Simple_Factory.clase.Credit;
import D1_Simple_Factory.clase.CreditIpotecar;
import D1_Simple_Factory.clase.CreditNevoiPersonale;

public class FactoryCredit {
    public Credit createCredit(TipCredit tip, String numeClient, double valoareCredit, double valoareRata, String extra){
        return switch(tip){
          case Ipotecar -> new CreditIpotecar(numeClient, valoareCredit, valoareRata, extra);
            case NevoiPersonale -> new CreditNevoiPersonale(numeClient, valoareCredit, valoareRata, extra);
            default -> null;
        };
    }
}
