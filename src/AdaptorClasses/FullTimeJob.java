package AdaptorClasses;

public class FullTimeJob implements CreditBehavour {



    @Override
    public void getCreditType() {
        System.out.println("This is a full time Job");
    }

    @Override
    public void getTitle() {
        System.out.println("Title: Engineer");
    }


}
