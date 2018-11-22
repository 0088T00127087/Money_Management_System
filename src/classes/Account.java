package classes;


public class Account  {

    String accNumber;
    User user = new User();
    BalanceSheet blSheet;

    public Account(){
        user = new User();
        blSheet  = new BalanceSheet();
    }


    public void setAccNumber(String accNumber){
        this.accNumber = accNumber;
    }

    public String getAccNumber(){
        return accNumber;
    }



}