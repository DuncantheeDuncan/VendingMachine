package vendingmachine.Exceptions;

public class ChocolatesAllGoneException extends ProductNotFoundException {
    String exceptionMessage;

    public ChocolatesAllGoneException(String exceptionMessage) {
        super(exceptionMessage);
        this.exceptionMessage = exceptionMessage;
    }

    @Override
    public String getMessage() {
        return super.exceptionMessage;
    }
}