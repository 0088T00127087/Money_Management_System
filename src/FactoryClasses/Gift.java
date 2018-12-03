package FactoryClasses;

import interfaces.Credit;

public class Gift implements Credit {

    @Override
    public void getType(){
        System.out.print("FactoryClasses.Gift Creadit");
    }

    @Override
    public String setType() {
        return null;
    }
}
