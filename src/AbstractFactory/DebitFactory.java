package AbstractFactory;

import FactoryClasses.*;
import interfaces.Credit;
import interfaces.Debit;

public class DebitFactory extends AbstractFactory {


    public Credit getCreditType(String creditType){
        return null;
    }

    public Debit getDebitType(String debitType){
       if(debitType == null){
           return null;
       }
       if(debitType.equalsIgnoreCase("Bill")){
           return new Bill();
       }
       if(debitType.equalsIgnoreCase("Rent")){
           return new Rent();
       }
       if(debitType.equalsIgnoreCase("OtherDebitType")){
           return new OtherDebitType();
       }
       return null;
    }
}
