import classes.Account;
import classes.User;
import classes.Income;

public class DriverTest  {
    public static void main (String [] args){

        Income in = new Income();
        in.setIncomeType("Job");
        in.setIncomeAmount(500);
        in.setDate("weekly");


        User guest = new User();

        guest.setAccountNumber(1234);
        guest.setFirstName("Joe");
        guest.setLastName("Enright");
        guest.setAddress("Listowel");
        guest.setEmail("joe_enright@gmail.com");
        guest.setIncome(in);


        Account acc = new Account();

        acc.setAccountNumber();

        System.out.printf("Account Number is ", acc.getAccountNumber());

        System.out.println(guest.toString());



    }



}
