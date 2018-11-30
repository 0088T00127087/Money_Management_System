import DecoratorClasses.*;
import concreteClasses.*;
import interfaces.Item;

public class DriverTest  {
    public static void main (String [] args)  {

        Item job = new ItemTypeDecorator(new Credit());

        job.setType("Job");
        job.setAmount(2500);
        job.setFrequency("Monthly");

        job.display();

        job.toString();


}

}






