package AdaptorPackage;
import AdaptorClasses.*;
import interfaces.Credit;


public class CreditAdaptor implements Credit {

    CreditBehavour jobBehaviourObject;


    public CreditAdaptor(String jobBehaviour) {
        if (jobBehaviour.equalsIgnoreCase("Full Time Job")) {
            jobBehaviourObject = new FullTimeJob();
        }
        else if(jobBehaviour.equalsIgnoreCase("This is part Job")){
            jobBehaviourObject = new PartTimeJob();
        }

        }


    @Override
    public void getType() {

    }
}
