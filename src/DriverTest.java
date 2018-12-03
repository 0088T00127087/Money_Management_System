import AbstractFactory.*;
import AdaptorClasses.JobAdaptor;
import interfaces.*;


public class DriverTest  {
    public static void main (String [] args)  {

//        Item credit = new ItemTypeDecorator(new CreditP());
//
//        credit.setItemName("CreditP");
//        credit.setAmount(2500);
//        credit.setFrequency("Monthly");
//        credit.display();
//        credit.toString();


//        Item debit = new ItemTypeDecorator(new DebitP());
//        debit.setItemName("DebitP");
//        debit.setAmount(500);
//        debit.setFrequency("Monthly");
//
//        debit.display();

//        Item item2 = new CreditP();
//        System.out.println(item2.getDescription() + item2.amount());
//
//        item2 = new FactoryClasses.Job(item2);
//
//        System.out.println("After Wrapping");
//        System.out.println(item2.getDescription() + "\n" + item2.amount());


//        ItemFacotory factoryItem = new ItemFacotory();
//
//        Item  itemP = factoryItem.getDescription("CREDIT");
//        itemP.getDescription();


//       AbstractFactory creditItem = FactoryProducer.getFactory("interfaces.Credit");
//       Credit job1 = creditItem.getCreditType("FactoryClasses.Job");
//       job1.getType();
//
//       AbstractFactory debitItem = FactoryProducer.getFactory("interfaces.Debit");
//       Debit rent1 = debitItem.getDebitType("FactoryClasses.Rent");
//       rent1.getType();

       JobAdaptor job = new JobAdaptor();
       job.getCreditType();
       job.getTitle();





}

}






