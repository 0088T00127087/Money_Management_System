import DecoratorClasses.*;
import concreteClasses.*;
import interfaces.Item;

public class DriverTest  {
    public static void main (String [] args)  {

        Item credit = new ItemTypeDecorator(new Credit());

        credit.setType("Job");
        credit.setAmount(2500);
        credit.setFrequency("Monthly");
        credit.display();
        credit.toString();


        Item debit = new ItemTypeDecorator(new Debit());
        debit.setType("Rent");
        debit.setAmount(500);
        debit.setFrequency("Monthly");

        debit.display();


}

}






