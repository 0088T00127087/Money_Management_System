package classes;


public class Account  {

    int accNumber;
    User user = new User();
    BalanceSheet blSheet;

    public Account(){
        user = new User();
        blSheet  = new BalanceSheet();
    }


    public void setAccNumber(int accNumber){
        this.accNumber = accNumber;
    }

    public int getAccNumber(){
        return accNumber;
    }



}