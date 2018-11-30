package concreteClasses;
import interfaces.Item;

public class Debit implements Item {
    public void display(){
        System.out.println("Decorator_Pattern.Decorators.ConcreteClasses.Debit class");
    }

    @Override
    public void setType(String type) {

    }

    @Override
    public void setAmount(int amount){

    }

    @Override
    public void setFrequency(String frequency) {

    }


}
