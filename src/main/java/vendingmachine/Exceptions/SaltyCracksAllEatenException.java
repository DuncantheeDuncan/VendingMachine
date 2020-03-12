package vendingmachine.Exceptions;

public class SaltyCracksAllEatenException extends ProductNotFoundException {
    public SaltyCracksAllEatenException(String exceptionMessage) {
        super(exceptionMessage);
    }
}