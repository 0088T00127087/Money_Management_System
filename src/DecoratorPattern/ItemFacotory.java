package DecoratorPattern;

public class ItemFacotory {

    public Item getDescription(String itemType){
        if(itemType == null){
            return null;
        }
        if(itemType.equalsIgnoreCase( "CREDIT")){
            return new CreditP();
        }
        if(itemType.equalsIgnoreCase("DEBIT")){
            return new DebitP();
        }
        else
            return null;
    }



}
