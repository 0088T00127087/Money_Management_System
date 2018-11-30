package concreteClasses;
import interfaces.Item;

public class Credit implements Item {

    protected final String creditType = "CREDIT";
    protected String itemName = "";
    protected int creditAmount = 0;
    protected String creditFrequency = "";

    public void display(){
        System.out.println(creditType);
        System.out.println(itemName);
        System.out.println(creditAmount);
        System.out.println(creditFrequency);
    }

    public void setItemName(String itemName){
        this.itemName = itemName;
    }

    //protected void setType(String type){ }

    public void setAmount(int amount){ this.creditAmount = amount; }

    public void setFrequency(String frequency){ this.creditFrequency = frequency; }

    public String toString(){
        return "Type: " + creditType + "\nAmount: " + creditAmount + "\nFrequency: " + creditFrequency;
    }


}
