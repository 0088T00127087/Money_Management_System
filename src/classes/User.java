package classes;

public class User  {

    int userId;
    String name;
    String address;
    String email;
    String contactNo;


    public User(){

    }

    public User(int userId, String name, String address, String email, String contactNo ){
        this.userId = userId;
        this.name = name;
        this.address = address;
        this.email = email;
        this.contactNo = contactNo;

    }

    public String getFirstName() {
        return name;
    };

    public void setFirstName(String firstName) {
        this.name = firstName;
    };

    public String getAddress() {
        return address;
    };

    public void setAddress(String address) {
        this.address = address;
    };

    public String getEmail() {
        return email;
    };

    public void setEmail(String email) {
        this.email = email;
    };

    public int getAccountNumber() {
        return userId;
    };

    public void setAccountNumber(int accountNumber) {
        this.userId = accountNumber;
    };

    public String getContactNo(){
        return this.contactNo;
    }


    public String toString(){
        return"Account Number: " +getAccountNumber()+ "\nName: " + getFirstName()+"\nAddress: " + getAddress()+ "\nEmail: " + getEmail()+ "\nContact Number: " + getContactNo();
    }




}
