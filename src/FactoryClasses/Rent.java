package FactoryClasses;

import interfaces.Debit;

public class Rent implements Debit {
    @Override
    public void getType(){
        System.out.print("FactoryClasses.Rent interfaces.Debit");
    }
}
