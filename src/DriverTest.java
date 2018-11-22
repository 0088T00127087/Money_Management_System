import classes.*;

public class DriverTest  {
    public static void main (String [] args){


        User user = new User(1234, "joe Enright","Listowel","joe@gmail.com", "08734343");

        Income income = new Income("Job", 2500, "Weekly");

        Expenditure exp = new Expenditure("Fuel Car", 200, "Weekly");

        BalanceSheet blsheet = new BalanceSheet(user.getAccountNumber(), income, exp, "Weekly" );


        Account account = new Account();

        System.out.println("Account Number: " + user.getAccountNumber() + "\nName: "+  user.getFirstName() +"\nIncome: " + income.getIncomeAmount() + "\nExpenditure: " + exp.getExpenType());
        System.out.println("Calculation: " +blsheet.getCalculation_of_expenditure(income.getIncomeAmount(), exp.getAmount()));


    }



}
