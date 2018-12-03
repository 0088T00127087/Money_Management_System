package FactoryClasses;

import interfaces.Debit;

public class Bill implements Debit {
    @Override
    public void getType(){
        System.out.print("FactoryClasses.Bill interfaces.Debit");
    }
}
