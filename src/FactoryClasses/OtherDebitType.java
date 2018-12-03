package FactoryClasses;

import interfaces.Debit;

public class OtherDebitType implements Debit {
    @Override
    public void getType(){
        System.out.print("Other interfaces.Debit");
    }
}
