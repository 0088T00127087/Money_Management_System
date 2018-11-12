package classes;

public class Income {

    String incomeType;
    String date;
    int    incomeAmount;

    public Income(){

    }
    public String getIncomeType() {
        return incomeType;
    }

    public void setIncomeType(String incomeType) {
        this.incomeType = incomeType;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getIncomeAmount() {
        return incomeAmount;
    }

    public void setIncomeAmount(int incomeAmount) {
        this.incomeAmount = incomeAmount;
    }


    public String toString(){
        return "\nIncome Type: " + getIncomeType() + "\nDate: " + getDate() + "\nAmount: " + getIncomeAmount();
    }
}
