package classes;


public class Account extends Expenditure  {


    String accountNumber;

    public Account(){

        String accountNumber;

        Expenditure exp = new Expenditure();
        Income  income = new Income();
        Object Balance = new Balance();
    }




    public void setAccountNumber(){

        for(int i = 0; i <5; i++){
         double n = Math.random();

        }
    }

    public String getAccountNumber(){
        return accountNumber;
    }

}


