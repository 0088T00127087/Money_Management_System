package FactoryClasses;

import interfaces.Credit;

public class Inheritance implements Credit {
    @Override
    public void getType(){
        System.out.print(" FactoryClasses.Inheritance interfaces.Credit");
    }

    @Override
    public String setType() {
        return null;
    }
}
