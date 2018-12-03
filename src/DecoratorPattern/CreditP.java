package DecoratorPattern;

public class CreditP extends Item {

    public CreditP(){
        description = "interfaces.Credit";
    }

    public double amount(){
        return 2500;
    }
}
