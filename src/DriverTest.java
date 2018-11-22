import classes.*;

import javax.swing.*;

public class DriverTest  {
    public static void main (String [] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {


        User user = new User(1234, "joe Enright","Listowel","joe@gmail.com", "08734343");

        Income income = new Income("Job", 2500, "Weekly");

        Expenditure exp = new Expenditure("Fuel Car", 200, "Weekly");

        BalanceSheet blsheet = new BalanceSheet(user.getAccountNumber(), income, exp, "Weekly" );


        Account account = new Account();

        System.out.println(user.toString());
        System.out.println(income.toString());
        System.out.println(exp.toString());

        System.out.println("Calculation: " +blsheet.getCalculation_of_expenditure(income.getIncomeAmount(), exp.getAmount()));

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                CreateUserAccount cua = new CreateUserAccount();
                cua.setVisible(true);
                cua.setTitle("Create a New User");
            }
        });


    }



}
