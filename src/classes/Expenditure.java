package classes;

public class Expenditure {

    String ExpenType;
    double amount;
    String frequency;

    public Expenditure(String expenType, double amount, String frequency) {
        ExpenType = expenType;
        this.amount = amount;
        this.frequency = frequency;

    }

    public Expenditure() {

    }

    public String getExpenType() {
        return ExpenType;
    }

    public void setExpenType(String expenType) {
        ExpenType = expenType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String toString(){
        return "\nExpenditure Type: " + getExpenType() + "\nExpenditure Amount: " +getAmount() + "\nExpenditure Frequency: " + getFrequency();
    }

}
