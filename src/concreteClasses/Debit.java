package concreteClasses;
import interfaces.Item;

public class Debit implements Item {

    protected String debitType = "";
    protected int debitAmount = 0;
    protected String debitFrequency = "";

    public void display(){
        System.out.println(debitType);
        System.out.println(debitAmount);
        System.out.println(debitFrequency);
    }

    @Override
    public void setType(String type) {
        this.debitType = type;
    }

    @Override
    public void setAmount(int amount){
        this.debitAmount = amount;
    }

    @Override
    public void setFrequency(String frequency) {
        this.debitFrequency = frequency;
    }


}
