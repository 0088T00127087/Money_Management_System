package AdaptorClasses;

public class PartTimeJob implements CreditBehavour {
    @Override
    public void getCreditType() {
        System.out.println("This is a Part time Job");
    }

    @Override
    public void getTitle() {
        System.out.println("Title: Waiter");
    }
}
