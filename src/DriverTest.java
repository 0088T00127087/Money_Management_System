import classes.User;
import classes.Income;

public class DriverTest extends Tm {
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

        System.out.println(guest.toString());

        Tm a = new Tm();
        a.templateMethod();

    }



}
