package AdaptorPackage;
import AdaptorClasses.CreditBehavour;

public class JobBehaviour implements CreditBehavour {


    @Override
    public void getCreditType() {
        System.out.print("Type: Job ");
    }

    @Override
    public void getTitle() {
        System.out.print("Title: Title");
    }
}
