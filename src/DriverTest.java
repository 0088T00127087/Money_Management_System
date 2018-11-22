import classes.*;

public class DriverTest  {
    public static void main (String [] args){


        User user = new User(1234, "joe Enright","Listowel","joe@gmail.com", "08734343");

        Income income = new Income("Job", 2500, "Weekly");

        Expenditure exp = new Expenditure("Electric bill", 200, "Monthly");

        BalanceSheet blsheet = new BalanceSheet( );


        Account account = new Account();

        System.out.println("Account Number: " + user.getAccountNumber() + "\nName: "+  user.getFirstName());


    }



}
