package AdaptorClasses;

import AdaptorPackage.CreditAdaptor;
import interfaces.Credit;

public class JobAdaptor implements Credit {

    CreditAdaptor creditAdaptor;
    FullTimeJob job;

    @Override
    public void getType() {

    }

    @Override
    public String setType() {
        return null;
    }


    public void getCreditType() {
        System.out.println("\nThis is a job Adaptor class job type");
    }


    public void getTitle() {
        System.out.println("\nThis is a Job Adaptor class job Title");
    }

    public void setJobTitle(String title){

    }


}
