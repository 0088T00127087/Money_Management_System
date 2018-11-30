package DecoratorClasses;
import interfaces.Item;

public class ItemTypeDecorator extends ItemDecorator {

    public ItemTypeDecorator(Item decoratedItem){
        super(decoratedItem);
    }

    @Override
    public void display(){
        decoratedItem.display();
        //setType(decoratedItem);
        //setAmount(decoratedItem);
        //setFrequency(decoratedItem);
    }


    private void setAmount(Item decoratedItem) {
        System.out.println("\nAmount");
    }


    private void setType(Item decoratedItem){

       System.out.print("\nType");

    }

    private void setFrequency(Item decoratedItem){
        System.out.println("\nFrequency");
    }



}
