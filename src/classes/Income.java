package classes;

public class Income {

    String incomeType;
    int    incomeAmount;
    String frequency;

    public Income(){}

    public Income(String incomeType, int incomeAmount, String frequency) {
        this.incomeType = incomeType;
        this.incomeAmount = incomeAmount;
        this.frequency = frequency;
    }




    public String getIncomeType() {
        return incomeType;
    };

    public void setIncomeType(String incomeType) {
        this.incomeType = incomeType;
    };

    public String getFrequency() {
        return frequency;
    };

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    };

    public int getIncomeAmount() {
        return incomeAmount;
    };

    public void setIncomeAmount(int incomeAmount) {
        this.incomeAmount = incomeAmount;
    };

    public String toString(){
        return "\nIncome Type: " + getIncomeType()+ "\nIncome Amount: " + getIncomeAmount() + "\nIncome Frequency" + getFrequency();
    }


}
