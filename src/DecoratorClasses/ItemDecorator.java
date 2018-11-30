package DecoratorClasses;
import interfaces.Item;

public abstract class ItemDecorator implements Item {
    protected Item decoratedItem;

    public ItemDecorator(Item decoratedItem){
        this.decoratedItem = decoratedItem;
    }

    public void display(){
        decoratedItem.display();
    }

    public void setItemName(String type){
        decoratedItem.setItemName(type);
    }

    public void setAmount(int amount){
        decoratedItem.setAmount(amount);
    }

    public void setFrequency(String frequency){
        decoratedItem.setFrequency(frequency);
    }


}
