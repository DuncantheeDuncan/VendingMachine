package vendingmachine.Exceptions;

public class InvalidProductException extends ProductNotFoundException {
    String exceptionMessage;

    public InvalidProductException(String exceptionMessage) {
        super(exceptionMessage);
        this.exceptionMessage = exceptionMessage;
    }

    @Override
    public String getMessage() {
        return super.exceptionMessage;
    }
}
