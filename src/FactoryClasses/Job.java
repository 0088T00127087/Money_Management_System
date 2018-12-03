package FactoryClasses;

import interfaces.Credit;

public class Job implements Credit {



    @Override
    public void getType(){
        System.out.print(" FactoryClasses.Job interfaces.Credit");
    }

    @Override
    public String setType() {
        return null;
    }

    public void setType(String type){

    }

}
