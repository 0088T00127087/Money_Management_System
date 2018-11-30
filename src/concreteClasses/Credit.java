package concreteClasses;
import interfaces.Item;

public class Credit implements Item {

    protected String creditType = "";
    protected int creditAmount = 0;
    protected String creditFrequency = "";

    public void display(){
        System.out.println(creditType);
        System.out.println(creditAmount);
        System.out.println(creditFrequency);
    }


    public void setType(String type){
        this.creditType = type;
    }

    public void setAmount(int amount){ this.creditAmount = amount; }

    public void setFrequency(String frequency){ this.creditFrequency = frequency; }

    public String toString(){
        return "Type: " + creditType + "\nAmount: " + creditAmount + "\nFrequency: " + creditFrequency;
    }


}
