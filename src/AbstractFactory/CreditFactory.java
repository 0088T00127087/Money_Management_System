package AbstractFactory;

import FactoryClasses.*;
import interfaces.Credit;
import interfaces.Debit;

public class CreditFactory extends AbstractFactory {
    @Override
    public Credit getCreditType(String creditType){
        if (creditType == null){
            return null;
        }
        if(creditType.equalsIgnoreCase("Job")){
            return new Job();
        }
        if(creditType.equalsIgnoreCase("Inheritance")){
            return new Inheritance();
        }
        if(creditType.equalsIgnoreCase("Gift")){
            return new Gift();
        }

        return null;
    }

    public Debit getDebitType(String debitType){
        return null;
    }
}
