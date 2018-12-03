package DecoratorPattern;

public class Job extends ItemDecorator {
    Item item;


    public Job(Item item){
        this.item = item;
    }

    public String getDescription(){
        return item.getDescription() + ", FactoryClasses.Job";
    }

    public double amount(){
        return 2500;
    }

}
