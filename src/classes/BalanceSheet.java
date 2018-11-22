package classes;


public class BalanceSheet {

    String accNumber;
    Income income;
    Expenditure expenditure;
    double calculation;
    String frequency;

    public BalanceSheet(){

    }



    public BalanceSheet(String accNumber, Income income, Expenditure exp,  String freq){
        this.accNumber = "";
        this.income = new Income();
        this.expenditure = new Expenditure();
        this.frequency = "";
    }

    public BalanceSheet(int accountNumber, Income income, Expenditure exp, String weekly) {
    }


    public double getCalculation_of_expenditure(double incomeAmount, double exp){
      calculation =   (incomeAmount - exp);
      return calculation;
    }


}
