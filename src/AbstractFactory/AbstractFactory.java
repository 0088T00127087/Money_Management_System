package AbstractFactory;

import interfaces.Credit;
import interfaces.Debit;


public abstract class AbstractFactory {
     public abstract Credit getCreditType(String creditType);
     public abstract Debit getDebitType(String debitType);
}
