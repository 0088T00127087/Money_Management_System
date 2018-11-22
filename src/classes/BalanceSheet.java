package classes;


public class BalanceSheet {

    String accNumber;
    Income income;
    Expenditure expenditure;
    double calculation;
    String frequency;

    public BalanceSheet(){

    }

    public BalanceSheet(String accNumber, Income income, Expenditure exp, double calculation, String freq) {
    }

    public BalanceSheet(String accNumber, Income income, Expenditure exp,  String freq){
        this.accNumber = "";
        this.income = new Income();
        this.expenditure = new Expenditure();
        this.frequency = "";
    }


    public double getCalculation_of_expenditure(double incomeAmount, double exp){
      calculation =   (income.incomeAmount - expenditure.amount);
      return calculation;
    }


}
