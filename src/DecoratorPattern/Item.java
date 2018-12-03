package DecoratorPattern;

public abstract class Item {
    String description = "Unknown Item";

    public String getDescription(){
        return description;
    }

    public abstract double amount();
}
