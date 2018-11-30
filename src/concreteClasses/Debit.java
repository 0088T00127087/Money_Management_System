package concreteClasses;
import interfaces.Item;

public class Debit implements Item {

    protected final String debitType = "DEBIT";
    protected String itemName = "";
    protected int debitAmount = 0;
    protected String debitFrequency = "";

    public void display(){
        System.out.println(debitType);
        System.out.println(itemName);
        System.out.println(debitAmount);
        System.out.println(debitFrequency);
    }

    @Override
    public void setItemName(String itemName){
        this.itemName = itemName;
    }

    //@Override
   // public void setType(String type) {

    //}

    @Override
    public void setAmount(int amount){
        this.debitAmount = amount;
    }

    @Override
    public void setFrequency(String frequency) {
        this.debitFrequency = frequency;
    }


}
