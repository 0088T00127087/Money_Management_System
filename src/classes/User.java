package classes;

public class User  {

    int userId;
    String firstName;
    String lastName;
    String address;
    String email;
    String contactNo;


    public User(){

    }

    public User(int accNumber, String fName, String lName, String cAddress, String email, String contactNo ){
        this.userId = accNumber;
        this.firstName = fName;
        this.lastName = lName;
        this.address = cAddress;
        this.email = email;
        this.contactNo = contactNo;

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
        return userId;
    }

    public void setAccountNumber(int accountNumber) {
        this.userId = accountNumber;
    }




}
