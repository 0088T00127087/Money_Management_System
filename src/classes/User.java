
package classes;
import java.util.Random;

public class User  {

    String userId;
    String name;
    String address;
    String email;
    String contactNo;


    public User(){

    }

    public User(String userId, String name, String address, String email, String contactNo ){
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

    public String getAccountNumber() {
        return userId;
    };

    public void setAccountNumber(String accountNumber) {
        this.userId = accountNumber;
    };

    public void setContactNo(String contactNo){ this.contactNo = contactNo;}

    public String getContactNo(){
        return this.contactNo;
    }


    public String toString(){
        return"Account Number: " +getAccountNumber()+ "\nName: " + getFirstName()+"\nAddress: " + getAddress()+ "\nEmail: " + getEmail()+ "\nContact Number: " + getContactNo();
    }

    public String  generateRandomAccountNumber(){
        Random rand = new Random();
        String accNoGen = "IE";
        for (int i = 0; i < 14; i++)
        {
            int n = rand.nextInt(10) + 0;
            accNoGen += Integer.toString(n);
        }
        for (int i = 0; i < 16; i++)
        {
            if(i % 4 == 0)
                System.out.print(" ");
            System.out.print(accNoGen.charAt(i));
        }

        return accNoGen;
    }




}
