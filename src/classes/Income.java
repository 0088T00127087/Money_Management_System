package classes;

public class Income {

    String incomeType;
    String frequency;
    int    incomeAmount;

    public Income(String incomeType, String frequency, int incomeAmount) {
        this.incomeType = incomeType;
        this.frequency = frequency;
        this.incomeAmount = incomeAmount;
    }

    public Income(String job, int i, String weekly) {
    }

    public Income() {

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


}
