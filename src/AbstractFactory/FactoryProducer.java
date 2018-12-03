package AbstractFactory;

import AbstractFactory.AbstractFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String type){
        if(type.equalsIgnoreCase("interfaces.Credit")){
            return new CreditFactory();
        }
        if(type.equalsIgnoreCase("interfaces.Debit")){
            return new DebitFactory();
        }
        return null;
    }
}
