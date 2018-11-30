package abstractClasses;
import interfaces.Income;


public abstract class JobDecorator implements Income {
    protected Income decoratedJob;

    public JobDecorator(Income decoratedJob){
        this.decoratedJob = decoratedJob;
    }

    public void type(){
        decoratedJob.type();
    }

    public void amount(){
        decoratedJob.amount();
    }

    public void frequency(){
        decoratedJob.frequency();
    }

}
