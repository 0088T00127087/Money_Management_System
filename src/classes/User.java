package classes;

public class User extends Income {

    int accountNumber;
    String firstName;
    String lastName;
    String address;
    String email;
    Income income;

    public User(){

    }

    public User(int accNumber, String fName, String lName, String cAddress, String email, Income income ){
        this.accountNumber = accNumber;
        this.firstName = fName;
        this.lastName = lName;
        this.address = cAddress;
        this.email = email;
        this.income = income;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setIncome(Income income){this.income = income;}

   public String toString(){
        return "Account Number: " + getAccountNumber() + "\nName: "  + getFirstName() +
                "\nSecond Name: " + getLastName() + "\nAddress: " + getAddress() +
                "\nEmail: " + getEmail()  + income.toString();
    }



}
