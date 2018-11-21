package classes;


public class BalanceSheet {

    String accNumber;
    Income income;
    Expenditure expenditure;
    double calculation;
    String frequency;

    public BalanceSheet(String accNumber){
        this.accNumber = "";
        income = new Income();
        expenditure = new Expenditure();
        calculation = 0;
        frequency = "";
    }



}
